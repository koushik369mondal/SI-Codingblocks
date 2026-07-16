let codingLang = ["js", "python", "c++", "java", "c", "ruby"];

// for(let key in codingLang){
//     console.log(codingLang[key]);
// }

// for-each
// codingLang.forEach(function(item){
//     console.log(item);
// })

//using arrow function
// codingLang.forEach((item) =>{
//     console.log(item);
// })

// let myArr = [
//     {
//         langname: "C++",
//         langext: "cpp"
//     },
//     {
//         langname: "JavaScript",
//         langext: "js"
//     },
//     {
//         langname: "Java",
//         langext: "java"
//     },
//     {
//         langname: "Python",
//         langext: "py"
//     }
// ]

// myArr.forEach((item) => {
//     console.log(item.langext);
// })

let employees = [
    {
        name: "Rahul",
        id: 101,
        basic: 25000,
        hra: 5000,
        da: 3000
    },
    {
        name: "Elon",
        id: 102,
        basic: 30000,
        hra: 6000,
        da: 4000
    },
    {
        name: "Amit",
        id: 103,
        basic: 28000,
        hra: 5500,
        da: 3500
    }
];

employees.forEach((emp) => {
    console.log("Employee Name :", emp.name);
    console.log("Employee ID   :", emp.id);
    console.log("Total Salary  :", emp.basic + emp.hra + emp.da);
    console.log("----------------------------");
});