// 8) try to use other methods from fs module 
//   for directories 

// mkdir() → create directory
// readdir() → read directory contents
// rename() → rename directory
// rmdir() → remove directory

import fs from "fs";

// 1️⃣ Create Directory
fs.mkdir("TestFolder", (err) => {
    if (err) {
        console.log("Error creating directory:", err);
    } else {
        console.log("Directory created successfully");
    }
});

// 2️⃣ Read Directory
fs.readdir("./", (err, files) => {
    if (err) {
        console.log("Error reading directory:", err);
    } else {
        console.log("Files in current directory:");
        console.log(files);
    }
});

// 3️⃣ Rename Directory
fs.rename("TestFolder", "NewTestFolder", (err) => {
    if (err) {
        console.log("Error renaming directory:", err);
    } else {
        console.log("Directory renamed successfully");
    }
});

// 4️⃣ Remove Directory
fs.rmdir("NewTestFolder", (err) => {
    if (err) {
        console.log("Error removing directory:", err);
    } else {
        console.log("Directory removed successfully");
    }
});