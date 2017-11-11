using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace ReportesProyecto2_EDD
{
    public partial class Inicio : Form
    {
        public Inicio()
        {
            InitializeComponent();
        }

        private void btnGraficarCola_Click(object sender, EventArgs e)
        {
            Globales.nombreMetodo = "CrearArchivoListaDobleUsuarios";
            Globales.nombreReporte = "ListaDobleUsuarios";
            Reportes verPanel = new Reportes();
            verPanel.lbTitulo.Text = "Reporte Usuarios";            
            verPanel.ShowDialog();
        }

        private void btnMostrar_Click(object sender, EventArgs e)
        {
            Globales.nombreMetodo = "CrearArchivoArbolB";
            Globales.nombreReporte = "ArbolB";
            Reportes verPanel = new Reportes();
            verPanel.lbTitulo.Text = "Reporte Bitacora";
            verPanel.ShowDialog();
        }

        private void bunifuThinButton21_Click(object sender, EventArgs e)
        {
            Globales.nombreMetodo = "CrearArchivoMatriz";
            Globales.nombreReporte = "Matriz";
            Reportes verPanel = new Reportes();
            verPanel.lbTitulo.Text = "Reporte Matriz";
            verPanel.ShowDialog();
        }

        private void bunifuThinButton22_Click(object sender, EventArgs e)
        {
            Globales.nombreMetodo = "CrearTablaHash";
            Globales.nombreReporte = "TablaHash";
            Reportes verPanel = new Reportes();
            verPanel.lbTitulo.Text = "Reporte Tabla Hash";
            verPanel.ShowDialog();
        }

        private void bunifuThinButton23_Click(object sender, EventArgs e)
        {
            Globales.nombreMetodo = "CrearArchivoListaSimpleHabitaciones";
            Globales.nombreReporte = "ListaSimpleCircularHabitaciones";
            Reportes verPanel = new Reportes();
            verPanel.lbTitulo.Text = "Reporte Habitaciones";
            verPanel.ShowDialog();
        }

        private void bunifuThinButton24_Click(object sender, EventArgs e)
        {
            Globales.nombreMetodo = "CrearArchivoAVL";
            Globales.nombreReporte = "ArbolAVL";
            Reportes verPanel = new Reportes();
            verPanel.lbTitulo.Text = "Reporte AVL";
            verPanel.ShowDialog();
        } 

        private void panel2_MouseDown(object sender, MouseEventArgs e)
        {
            MoverPanel.ReleaseCapture();
            MoverPanel.SendMessage(this.Handle, 0x112, 0xf012, 0);
        }

        private void lblMinimizar_Click(object sender, EventArgs e)
        {
            this.WindowState = FormWindowState.Minimized;
        }

        private void lblSalir_Click(object sender, EventArgs e)
        {
            this.Dispose();
        }       
    }
}
