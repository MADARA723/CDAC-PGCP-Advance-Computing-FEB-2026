namespace WindowsFormsApp1
{
    partial class Form1
    {
        /// <summary>
        /// Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Clean up any resources being used.
        /// </summary>
        /// <param name="disposing">true if managed resources should be disposed; otherwise, false.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Windows Form Designer generated code

        /// <summary>
        /// Required method for Designer support - do not modify
        /// the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            this.Savea = new System.Windows.Forms.Button();
            this.Dsiplay = new System.Windows.Forms.Button();
            this.empClear = new System.Windows.Forms.Button();
            this.Remove = new System.Windows.Forms.Button();
            this.EName = new System.Windows.Forms.TextBox();
            this.EEmail = new System.Windows.Forms.TextBox();
            this.label1 = new System.Windows.Forms.Label();
            this.label2 = new System.Windows.Forms.Label();
            this.label3 = new System.Windows.Forms.Label();
            this.empDesignation = new System.Windows.Forms.ComboBox();
            this.label5 = new System.Windows.Forms.Label();
            this.ListDisplayBox = new System.Windows.Forms.ListBox();
            this.SuspendLayout();
            // 
            // Savea
            // 
            this.Savea.Location = new System.Drawing.Point(200, 239);
            this.Savea.Name = "Savea";
            this.Savea.Size = new System.Drawing.Size(75, 41);
            this.Savea.TabIndex = 0;
            this.Savea.Text = "Save";
            this.Savea.UseVisualStyleBackColor = true;
            this.Savea.Click += new System.EventHandler(this.buttSave);
            // 
            // Dsiplay
            // 
            this.Dsiplay.Location = new System.Drawing.Point(336, 239);
            this.Dsiplay.Name = "Dsiplay";
            this.Dsiplay.Size = new System.Drawing.Size(75, 41);
            this.Dsiplay.TabIndex = 1;
            this.Dsiplay.Text = "Display";
            this.Dsiplay.UseVisualStyleBackColor = true;
            this.Dsiplay.Click += new System.EventHandler(this.buttDisplay);
            // 
            // empClear
            // 
            this.empClear.Location = new System.Drawing.Point(546, 239);
            this.empClear.Name = "empClear";
            this.empClear.Size = new System.Drawing.Size(75, 41);
            this.empClear.TabIndex = 2;
            this.empClear.Text = " Clear";
            this.empClear.UseVisualStyleBackColor = true;
            this.empClear.Click += new System.EventHandler(this.buttClear);
            // 
            // Remove
            // 
            this.Remove.Location = new System.Drawing.Point(651, 239);
            this.Remove.Name = "Remove";
            this.Remove.Size = new System.Drawing.Size(75, 41);
            this.Remove.TabIndex = 3;
            this.Remove.Text = "Remove";
            this.Remove.UseVisualStyleBackColor = true;
            this.Remove.Click += new System.EventHandler(this.buttRemove);
            // 
            // EName
            // 
            this.EName.Location = new System.Drawing.Point(336, 97);
            this.EName.Name = "EName";
            this.EName.Size = new System.Drawing.Size(285, 22);
            this.EName.TabIndex = 4;
            this.EName.TextChanged += new System.EventHandler(this.textName);
            // 
            // EEmail
            // 
            this.EEmail.Location = new System.Drawing.Point(336, 137);
            this.EEmail.Name = "EEmail";
            this.EEmail.Size = new System.Drawing.Size(285, 22);
            this.EEmail.TabIndex = 5;
            this.EEmail.TextChanged += new System.EventHandler(this.textEmail);
            // 
            // label1
            // 
            this.label1.AutoSize = true;
            this.label1.Location = new System.Drawing.Point(231, 137);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(10, 16);
            this.label1.TabIndex = 6;
            this.label1.Text = " ";
            // 
            // label2
            // 
            this.label2.AutoSize = true;
            this.label2.Location = new System.Drawing.Point(231, 97);
            this.label2.Name = "label2";
            this.label2.Size = new System.Drawing.Size(75, 16);
            this.label2.TabIndex = 7;
            this.label2.Text = "Emp Name\r\n";
            // 
            // label3
            // 
            this.label3.AutoSize = true;
            this.label3.Location = new System.Drawing.Point(231, 137);
            this.label3.Name = "label3";
            this.label3.Size = new System.Drawing.Size(72, 16);
            this.label3.TabIndex = 8;
            this.label3.Text = "Emp Email";
            this.label3.Click += new System.EventHandler(this.label3_Click);
            // 
            // empDesignation
            // 
            this.empDesignation.FormattingEnabled = true;
            this.empDesignation.Items.AddRange(new object[] {
            "HR",
            "Manager"});
            this.empDesignation.Location = new System.Drawing.Point(336, 177);
            this.empDesignation.Name = "empDesignation";
            this.empDesignation.Size = new System.Drawing.Size(285, 24);
            this.empDesignation.TabIndex = 10;
            this.empDesignation.SelectedIndexChanged += new System.EventHandler(this.cmbdesignation);
            // 
            // label5
            // 
            this.label5.AutoSize = true;
            this.label5.Location = new System.Drawing.Point(231, 180);
            this.label5.Name = "label5";
            this.label5.Size = new System.Drawing.Size(79, 16);
            this.label5.TabIndex = 12;
            this.label5.Text = "Designation";
            // 
            // ListDisplayBox
            // 
            this.ListDisplayBox.FormattingEnabled = true;
            this.ListDisplayBox.ItemHeight = 16;
            this.ListDisplayBox.Location = new System.Drawing.Point(200, 343);
            this.ListDisplayBox.Name = "ListDisplayBox";
            this.ListDisplayBox.Size = new System.Drawing.Size(526, 84);
            this.ListDisplayBox.TabIndex = 13;
            this.ListDisplayBox.SelectedIndexChanged += new System.EventHandler(this.ListDisplayBox_SelectedIndexChanged);
            // 
            // Form1
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(8F, 16F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(971, 552);
            this.Controls.Add(this.ListDisplayBox);
            this.Controls.Add(this.label5);
            this.Controls.Add(this.empDesignation);
            this.Controls.Add(this.label3);
            this.Controls.Add(this.label2);
            this.Controls.Add(this.label1);
            this.Controls.Add(this.EEmail);
            this.Controls.Add(this.EName);
            this.Controls.Add(this.Remove);
            this.Controls.Add(this.empClear);
            this.Controls.Add(this.Dsiplay);
            this.Controls.Add(this.Savea);
            this.Name = "Form1";
            this.Text = "Employee Management System";
            this.Load += new System.EventHandler(this.Form1_Load);
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.Button Savea;
        private System.Windows.Forms.Button Dsiplay;
        private System.Windows.Forms.Button empClear;
        private System.Windows.Forms.Button Remove;
        private System.Windows.Forms.TextBox EName;
        private System.Windows.Forms.TextBox EEmail;
        private System.Windows.Forms.Label label1;
        private System.Windows.Forms.Label label2;
        private System.Windows.Forms.Label label3;
        private System.Windows.Forms.ComboBox empDesignation;
        private System.Windows.Forms.Label label5;
        private System.Windows.Forms.ListBox ListDisplayBox;
    }
}

