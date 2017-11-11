namespace ReportesProyecto2_EDD
{
    partial class Reportes
    {
        /// <summary>
        /// Variable del diseñador requerida.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Limpiar los recursos que se estén utilizando.
        /// </summary>
        /// <param name="disposing">true si los recursos administrados se deben desechar; false en caso contrario.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Código generado por el Diseñador de Windows Forms

        /// <summary>
        /// Método necesario para admitir el Diseñador. No se puede modificar
        /// el contenido del método con el editor de código.
        /// </summary>
        private void InitializeComponent()
        {
            System.ComponentModel.ComponentResourceManager resources = new System.ComponentModel.ComponentResourceManager(typeof(Reportes));
            this.panel2 = new System.Windows.Forms.Panel();
            this.lbTitulo = new System.Windows.Forms.Label();
            this.lblMinimizar = new System.Windows.Forms.Label();
            this.lblSalir = new System.Windows.Forms.Label();
            this.panel3 = new System.Windows.Forms.Panel();
            this.lbRespuesta = new System.Windows.Forms.Label();
            this.btnGraficarCola = new ns1.BunifuThinButton2();
            this.btnMostrar = new ns1.BunifuThinButton2();
            this.ptbImagen = new System.Windows.Forms.Panel();
            this.ptbGrafica = new System.Windows.Forms.PictureBox();
            this.dtp = new System.Windows.Forms.DateTimePicker();
            this.panel2.SuspendLayout();
            this.panel3.SuspendLayout();
            this.ptbImagen.SuspendLayout();
            ((System.ComponentModel.ISupportInitialize)(this.ptbGrafica)).BeginInit();
            this.SuspendLayout();
            // 
            // panel2
            // 
            this.panel2.BackColor = System.Drawing.Color.FromArgb(((int)(((byte)(31)))), ((int)(((byte)(43)))), ((int)(((byte)(55)))));
            this.panel2.Controls.Add(this.lbTitulo);
            this.panel2.Controls.Add(this.lblMinimizar);
            this.panel2.Controls.Add(this.lblSalir);
            this.panel2.Cursor = System.Windows.Forms.Cursors.NoMove2D;
            this.panel2.Dock = System.Windows.Forms.DockStyle.Top;
            this.panel2.Location = new System.Drawing.Point(0, 0);
            this.panel2.Name = "panel2";
            this.panel2.Size = new System.Drawing.Size(1252, 41);
            this.panel2.TabIndex = 4;
            this.panel2.MouseDown += new System.Windows.Forms.MouseEventHandler(this.panel2_MouseDown);
            // 
            // lbTitulo
            // 
            this.lbTitulo.AutoSize = true;
            this.lbTitulo.BackColor = System.Drawing.Color.Transparent;
            this.lbTitulo.Font = new System.Drawing.Font("Microsoft Sans Serif", 10.8F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.lbTitulo.ForeColor = System.Drawing.Color.White;
            this.lbTitulo.Location = new System.Drawing.Point(22, 11);
            this.lbTitulo.Name = "lbTitulo";
            this.lbTitulo.Size = new System.Drawing.Size(84, 24);
            this.lbTitulo.TabIndex = 8;
            this.lbTitulo.Text = "Reporte";
            // 
            // lblMinimizar
            // 
            this.lblMinimizar.AutoSize = true;
            this.lblMinimizar.BackColor = System.Drawing.Color.Transparent;
            this.lblMinimizar.Cursor = System.Windows.Forms.Cursors.Hand;
            this.lblMinimizar.Font = new System.Drawing.Font("Arial", 16.2F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.lblMinimizar.ForeColor = System.Drawing.Color.White;
            this.lblMinimizar.Location = new System.Drawing.Point(1179, 7);
            this.lblMinimizar.Name = "lblMinimizar";
            this.lblMinimizar.Size = new System.Drawing.Size(24, 33);
            this.lblMinimizar.TabIndex = 11;
            this.lblMinimizar.Text = "-";
            this.lblMinimizar.Click += new System.EventHandler(this.lblMinimizar_Click);
            // 
            // lblSalir
            // 
            this.lblSalir.AutoSize = true;
            this.lblSalir.BackColor = System.Drawing.Color.Transparent;
            this.lblSalir.Cursor = System.Windows.Forms.Cursors.Hand;
            this.lblSalir.Font = new System.Drawing.Font("Arial", 13.8F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.lblSalir.ForeColor = System.Drawing.Color.White;
            this.lblSalir.Location = new System.Drawing.Point(1214, 9);
            this.lblSalir.Name = "lblSalir";
            this.lblSalir.Size = new System.Drawing.Size(26, 29);
            this.lblSalir.TabIndex = 10;
            this.lblSalir.Text = "x";
            this.lblSalir.Click += new System.EventHandler(this.lblSalir_Click);
            // 
            // panel3
            // 
            this.panel3.BackColor = System.Drawing.Color.FromArgb(((int)(((byte)(31)))), ((int)(((byte)(43)))), ((int)(((byte)(55)))));
            this.panel3.Controls.Add(this.lbRespuesta);
            this.panel3.Dock = System.Windows.Forms.DockStyle.Bottom;
            this.panel3.Location = new System.Drawing.Point(0, 743);
            this.panel3.Name = "panel3";
            this.panel3.Size = new System.Drawing.Size(1252, 43);
            this.panel3.TabIndex = 5;
            // 
            // lbRespuesta
            // 
            this.lbRespuesta.AutoSize = true;
            this.lbRespuesta.BackColor = System.Drawing.Color.Transparent;
            this.lbRespuesta.Font = new System.Drawing.Font("Microsoft Sans Serif", 10.8F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.lbRespuesta.ForeColor = System.Drawing.Color.White;
            this.lbRespuesta.Location = new System.Drawing.Point(22, 10);
            this.lbRespuesta.Name = "lbRespuesta";
            this.lbRespuesta.Size = new System.Drawing.Size(0, 24);
            this.lbRespuesta.TabIndex = 9;
            // 
            // btnGraficarCola
            // 
            this.btnGraficarCola.ActiveBorderThickness = 1;
            this.btnGraficarCola.ActiveCornerRadius = 20;
            this.btnGraficarCola.ActiveFillColor = System.Drawing.Color.FromArgb(((int)(((byte)(255)))), ((int)(((byte)(224)))), ((int)(((byte)(192)))));
            this.btnGraficarCola.ActiveForecolor = System.Drawing.Color.FromArgb(((int)(((byte)(255)))), ((int)(((byte)(128)))), ((int)(((byte)(0)))));
            this.btnGraficarCola.ActiveLineColor = System.Drawing.Color.FromArgb(((int)(((byte)(255)))), ((int)(((byte)(224)))), ((int)(((byte)(192)))));
            this.btnGraficarCola.BackColor = System.Drawing.Color.FromArgb(((int)(((byte)(41)))), ((int)(((byte)(53)))), ((int)(((byte)(65)))));
            this.btnGraficarCola.BackgroundImage = ((System.Drawing.Image)(resources.GetObject("btnGraficarCola.BackgroundImage")));
            this.btnGraficarCola.ButtonText = "Graficar";
            this.btnGraficarCola.Cursor = System.Windows.Forms.Cursors.Hand;
            this.btnGraficarCola.Font = new System.Drawing.Font("Century Gothic", 13.8F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.btnGraficarCola.ForeColor = System.Drawing.Color.FromArgb(((int)(((byte)(41)))), ((int)(((byte)(53)))), ((int)(((byte)(65)))));
            this.btnGraficarCola.IdleBorderThickness = 1;
            this.btnGraficarCola.IdleCornerRadius = 25;
            this.btnGraficarCola.IdleFillColor = System.Drawing.Color.White;
            this.btnGraficarCola.IdleForecolor = System.Drawing.Color.DarkOrange;
            this.btnGraficarCola.IdleLineColor = System.Drawing.Color.DarkOrange;
            this.btnGraficarCola.Location = new System.Drawing.Point(423, 663);
            this.btnGraficarCola.Margin = new System.Windows.Forms.Padding(6, 6, 6, 6);
            this.btnGraficarCola.Name = "btnGraficarCola";
            this.btnGraficarCola.Size = new System.Drawing.Size(200, 61);
            this.btnGraficarCola.TabIndex = 11;
            this.btnGraficarCola.TextAlign = System.Drawing.ContentAlignment.MiddleCenter;
            this.btnGraficarCola.Click += new System.EventHandler(this.btnGraficarCola_Click);
            // 
            // btnMostrar
            // 
            this.btnMostrar.ActiveBorderThickness = 1;
            this.btnMostrar.ActiveCornerRadius = 20;
            this.btnMostrar.ActiveFillColor = System.Drawing.Color.CornflowerBlue;
            this.btnMostrar.ActiveForecolor = System.Drawing.Color.Navy;
            this.btnMostrar.ActiveLineColor = System.Drawing.Color.CornflowerBlue;
            this.btnMostrar.BackColor = System.Drawing.Color.FromArgb(((int)(((byte)(41)))), ((int)(((byte)(53)))), ((int)(((byte)(65)))));
            this.btnMostrar.BackgroundImage = ((System.Drawing.Image)(resources.GetObject("btnMostrar.BackgroundImage")));
            this.btnMostrar.ButtonText = "Mostrar";
            this.btnMostrar.Cursor = System.Windows.Forms.Cursors.Hand;
            this.btnMostrar.Font = new System.Drawing.Font("Century Gothic", 13.8F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.btnMostrar.ForeColor = System.Drawing.Color.FromArgb(((int)(((byte)(41)))), ((int)(((byte)(53)))), ((int)(((byte)(65)))));
            this.btnMostrar.IdleBorderThickness = 1;
            this.btnMostrar.IdleCornerRadius = 25;
            this.btnMostrar.IdleFillColor = System.Drawing.Color.White;
            this.btnMostrar.IdleForecolor = System.Drawing.Color.Navy;
            this.btnMostrar.IdleLineColor = System.Drawing.Color.Navy;
            this.btnMostrar.Location = new System.Drawing.Point(655, 661);
            this.btnMostrar.Margin = new System.Windows.Forms.Padding(7);
            this.btnMostrar.Name = "btnMostrar";
            this.btnMostrar.Size = new System.Drawing.Size(200, 63);
            this.btnMostrar.TabIndex = 12;
            this.btnMostrar.TextAlign = System.Drawing.ContentAlignment.MiddleCenter;
            this.btnMostrar.Click += new System.EventHandler(this.btnMostrar_Click);
            // 
            // ptbImagen
            // 
            this.ptbImagen.AutoScroll = true;
            this.ptbImagen.BackgroundImageLayout = System.Windows.Forms.ImageLayout.Center;
            this.ptbImagen.Controls.Add(this.ptbGrafica);
            this.ptbImagen.Location = new System.Drawing.Point(40, 85);
            this.ptbImagen.Name = "ptbImagen";
            this.ptbImagen.Size = new System.Drawing.Size(1182, 569);
            this.ptbImagen.TabIndex = 13;
            // 
            // ptbGrafica
            // 
            this.ptbGrafica.BackgroundImageLayout = System.Windows.Forms.ImageLayout.Stretch;
            this.ptbGrafica.Location = new System.Drawing.Point(4, 3);
            this.ptbGrafica.Name = "ptbGrafica";
            this.ptbGrafica.Size = new System.Drawing.Size(1175, 563);
            this.ptbGrafica.TabIndex = 0;
            this.ptbGrafica.TabStop = false;
            // 
            // dtp
            // 
            this.dtp.Location = new System.Drawing.Point(40, 54);
            this.dtp.Name = "dtp";
            this.dtp.Size = new System.Drawing.Size(357, 22);
            this.dtp.TabIndex = 14;
            this.dtp.Visible = false;
            // 
            // Reportes
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(8F, 16F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.BackColor = System.Drawing.Color.FromArgb(((int)(((byte)(41)))), ((int)(((byte)(53)))), ((int)(((byte)(65)))));
            this.ClientSize = new System.Drawing.Size(1252, 786);
            this.Controls.Add(this.dtp);
            this.Controls.Add(this.ptbImagen);
            this.Controls.Add(this.btnMostrar);
            this.Controls.Add(this.btnGraficarCola);
            this.Controls.Add(this.panel3);
            this.Controls.Add(this.panel2);
            this.FormBorderStyle = System.Windows.Forms.FormBorderStyle.None;
            this.Icon = ((System.Drawing.Icon)(resources.GetObject("$this.Icon")));
            this.Name = "Reportes";
            this.StartPosition = System.Windows.Forms.FormStartPosition.CenterScreen;
            this.Text = "Form1";
            this.panel2.ResumeLayout(false);
            this.panel2.PerformLayout();
            this.panel3.ResumeLayout(false);
            this.panel3.PerformLayout();
            this.ptbImagen.ResumeLayout(false);
            ((System.ComponentModel.ISupportInitialize)(this.ptbGrafica)).EndInit();
            this.ResumeLayout(false);

        }

        #endregion

        private System.Windows.Forms.Panel panel2;
        private System.Windows.Forms.Label lblMinimizar;
        private System.Windows.Forms.Label lblSalir;
        private System.Windows.Forms.Panel panel3;
        private ns1.BunifuThinButton2 btnGraficarCola;
        private ns1.BunifuThinButton2 btnMostrar;
        private System.Windows.Forms.Label lbRespuesta;
        public System.Windows.Forms.Label lbTitulo;
        private System.Windows.Forms.Panel ptbImagen;
        private System.Windows.Forms.PictureBox ptbGrafica;
        public System.Windows.Forms.DateTimePicker dtp;
    }
}

