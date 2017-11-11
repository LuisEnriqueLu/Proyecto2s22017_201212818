using System;
using System.Collections.Generic;
using System.Collections.Specialized;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Net;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace ReportesProyecto2_EDD
{
    public partial class Reportes : Form
    {
        
        public Reportes()
        {
            InitializeComponent();
            if (Globales.nombreReporte.Equals("TablaHash"))
            {
                dtp.Visible = true;   
            }
        }

        private void lblSalir_Click(object sender, EventArgs e)
        {
            this.Dispose();            
        }

        private void lblMinimizar_Click(object sender, EventArgs e)
        {
            this.WindowState = FormWindowState.Minimized;
        }

        private void panel2_MouseDown(object sender, MouseEventArgs e)
        {
            MoverPanel.ReleaseCapture();
            MoverPanel.SendMessage(this.Handle, 0x112, 0xf012, 0);
        }

        private void btnGraficarCola_Click(object sender, EventArgs e)
        {
            if (ptbGrafica.Image != null)
            {
                ptbGrafica.Image.Dispose();
                ptbGrafica.Image = null;
            }

            if (Globales.nombreReporte.Equals("TablaHash"))
            {
                CrearArchivoParametros(Globales.nombreMetodo);
                GenerarImagen(Globales.nombreReporte);
            }
            else {
                CrearArchivo(Globales.nombreMetodo);
                GenerarImagen(Globales.nombreReporte);
            }            
        }        

        private void btnMostrar_Click(object sender, EventArgs e)
        {
            Image img = Image.FromFile(@"C:\Users\l_enr\Desktop\" + Globales.nombreReporte + ".jpg");
            ptbImagen.AutoScroll = true;
            ptbImagen.AutoScrollMinSize = new Size(0, 2000);
            ptbGrafica.Image = img;            
            ptbGrafica.Size = new Size(2000, 2000);
        }

        public void CrearArchivo(string NombreMetodo)
        {
            try
            {
                using (var cliente = new WebClient())
                {
                    var respuestaPython = cliente.DownloadString("http://" + Globales.IP + ":5000/" + NombreMetodo);
                    lbRespuesta.Text = respuestaPython;
                    Console.WriteLine(respuestaPython);
                }
            }
            catch (Exception ex)
            {
                Console.WriteLine(ex.ToString());
            }
        }

        private void GenerarImagen(string nombreImagen)
        {
            try
            {
                var procStartInfo = new System.Diagnostics.ProcessStartInfo("cmd", "/C dot -Tjpg C:\\Users\\l_enr\\Desktop\\" + nombreImagen + ".txt -o C:\\Users\\l_enr\\Desktop\\" + nombreImagen + ".jpg");
                var proc = new System.Diagnostics.Process();
                proc.StartInfo = procStartInfo;
                proc.Start();
                proc.WaitForExit();
                
            }
            catch (Exception ex)
            {
                Console.WriteLine(ex.ToString());
            }
        }

        public void CrearArchivoParametros(string NombreMetodo)
        {
            try
            {
                using (var cliente = new WebClient())
                {
                    var variablesEnviar = new NameValueCollection();
                    string anio = dtp.Value.Month.ToString();
                    variablesEnviar["anio"] = dtp.Value.Year.ToString();
                    variablesEnviar["numeroMes"] = dtp.Value.Month.ToString();
                    variablesEnviar["dia"] = dtp.Value.Day.ToString();

                    var respuestaMetodo = cliente.UploadValues("http://" + Globales.IP + ":5000/"+NombreMetodo, variablesEnviar);
                    var respuestaConvertidaString = Encoding.Default.GetString(respuestaMetodo);
                    Console.WriteLine(respuestaConvertidaString);
                }
            }
            catch (Exception ex)
            {
                Console.WriteLine("No es posible Conectar" + ex.ToString());
            }
        }
    }
}
