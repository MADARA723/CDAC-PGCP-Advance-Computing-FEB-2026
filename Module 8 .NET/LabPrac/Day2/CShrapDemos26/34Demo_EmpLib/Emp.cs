using System.ComponentModel.DataAnnotations.Schema;
using Effort.Internal.DbManagement.Schema;

namespace _34Demo_EmpLib
{

    //[CompanyInfo(CompanyName ="BonaventureSystems",DeveloperName ="Mugdha")]
    // ORM : Model/ Buissness Entity/ Plain Old CLR Object [POCO]

    [Table(TableName="Emp")]
    public class Employee //POCO Class
    {
        #region Demo 01
        //public void Data()
        // {

        // }
        // public void EmpData()
        // {

        // } 
        #endregion

        private string _EID;
        private string _EName;
        private string _EAddress;

        [Column(ColumnName = "Address", ColumnType = "varchar(50)")]
        public string EAddress
        {
            get { return _EAddress; }
            set { _EAddress = value; }
        }

        [Column(ColumnName="Name",ColumnType="varchar(50)")]
        public string EName
        {
            get { return _EName; }
            set { _EName = value; }
        }

        [Column(ColumnName = "Id", ColumnType = "int")]
        public string EID 
        {
            get { return _EID; }
            set { _EID = value; }
        }



    }
}
