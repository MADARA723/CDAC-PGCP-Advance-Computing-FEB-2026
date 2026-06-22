using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace WindowsFormsApp1
{
    public partial class Form1 : Form
    {
        List<Emp> emp = new List<Emp>();
        public Form1()
        {
            InitializeComponent();
        }

        private void textName(object sender, EventArgs e)
        {
            //Emp Name text Box


        }
        private void textEmail(object sender, EventArgs e)
        {
            //Emp Email Text Box

        }

        private void label3_Click(object sender, EventArgs e)
        {

        }


        private void Form1_Load(object sender, EventArgs e)
        {
            empDesignation.DataSource = Enum.GetValues(typeof(Designation));
            empDesignation.DropDownStyle = ComboBoxStyle.DropDownList;

        }

        private void buttSave(object sender, EventArgs e)
        {
            //Emp SAve
            Emp e1 = new Emp();

            e1.Name= EName.Text;
            e1.Email = EEmail.Text;

            e1.Designation = (Designation)empDesignation.SelectedItem;

            emp.Add(e1);

            MessageBox.Show("Employees saved Succesfully");
        }

        private void buttDisplay(object sender, EventArgs e)
        {
            //EMP Display
            ListDisplayBox.Items.Clear();

            foreach (Emp e1 in emp)
            {
                ListDisplayBox.Items.Add(e1);

            }
            
        }

        private void buttClear(object sender, EventArgs e)
        {
            EName.Clear();
            EEmail.Clear();
            empDesignation.SelectedIndex = 0;
                //EMP Clear
            
        }

        private void buttRemove(object sender, EventArgs e)
        {
            //Remove EMP
            Emp e1 = emp.Find(x=>x.Email==EEmail.Text);

            if(e1!=null)
            {
                emp.Remove(e1);
                MessageBox.Show("Employees removed Succesfully");

            }
            else
            {
                MessageBox.Show("Employees Not Found");

            }

        }

        private void cmbdesignation(object sender, EventArgs e)
        {

        }

        private void ListDisplayBox_SelectedIndexChanged(object sender, EventArgs e)
        {

        }
    }
}
