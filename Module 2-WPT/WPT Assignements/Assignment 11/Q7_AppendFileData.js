// 7) create file Employee.txt and append Employee Data in that file by creating Object of Employee 

import fs from "fs";

let EmployeeData = {
    EmpID: "1",
    Name: "Sashi",
    Salary: 6000
};

fs.appendFile(
    "Employee.txt",
    JSON.stringify(EmployeeData) + "\n",
    (err) => {
        if (err) {
            console.log("Error writing file:", err);
            return;
        }

        console.log("Employee data appended successfully");
    }
);
