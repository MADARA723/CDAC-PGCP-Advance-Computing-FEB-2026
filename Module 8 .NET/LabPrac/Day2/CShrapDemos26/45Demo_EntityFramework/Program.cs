using _45Demo_EntityFramework.DAL;
using _45Demo_EntityFramework.Models;

namespace _45Demo_EntityFramework
{
    internal class Program
    {
        static void Main(string[] args)
        {
            IETDbContext _dbContext = new IETDbContext();

            //_dbContext.emps --> just like declaration of LINQ
            //_dbContext.emps.ToList() --> just like firing of LINQ query

            #region Select Query
            //var result = _dbContext.emps.ToList();
            //foreach (Emp1 emp in result)
            //{
            //    Console.WriteLine($"ID: {emp.Id},Name: {emp.Name},Address: {emp.Address}");


            //} 
            #endregion

            #region Insert
            //Emp1 empToBeInserted = new Emp1() { Name = "Ron", Address = "Rome" };
            //_dbContext.emps.Add(empToBeInserted);
            //_dbContext.SaveChanges();

            #endregion

            #region Update
            //int id = 2;
            //Emp1 empToBeupdated = _dbContext.emps.Find(id);
            //empToBeupdated.Name = "Peter";
            //empToBeupdated.Address = "Mulshi";

            //_dbContext.SaveChanges(); 
            #endregion

            #region Delete
            //int idToBeDeleted = 2;
            //Emp1 empToBeDeleted = _dbContext.emps.Find(idToBeDeleted);
            //_dbContext.emps.Remove(empToBeDeleted);
            //_dbContext.SaveChanges();

            #endregion

        }
    }
}
