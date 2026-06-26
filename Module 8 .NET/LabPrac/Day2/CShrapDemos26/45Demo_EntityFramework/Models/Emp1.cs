using System;
using System.Collections.Generic;
using System.ComponentModel.DataAnnotations;
using System.ComponentModel.DataAnnotations.Schema;
using System.Linq;
using System.Net.Mime;
using System.Text;
using System.Threading.Tasks;

namespace _45Demo_EntityFramework.Models
{
    [Table("Emp1")]
    public class Emp1//POCO
    {
        [Key]//Primary Key+ Identity(1,1)-means Auto Increment
        [Column("Id", TypeName = "int")]
        public int Id { get; set; }
        [Column("Name", TypeName = "varchar(50)")]
        public string Name { get; set; }

        [Column("Address", TypeName = "varchar(50)")]
        public string Address { get; set; } 
    }
}
