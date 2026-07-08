let arr = [1, 2, 3, 4, 5, 6, 7, 8, 9];

// let newarr = [];

// arr.forEach((item) => {
//     if (item > 6) {
//         newarr.push(item);
//     }
// });

// let newarr = arr.filter((item) => {
//     return item > 6;
// })

// console.log(newarr);

let books = [
    {
        title: "The Silent Patient",
        genre: "Thriller",
        publish: "2019",
        edition: "2021"
    },
    {
        title: "Dune",
        genre: "Science Fiction",
        publish: "1965",
        edition: "2019"
    },
    {
        title: "Sapiens",
        genre: "History",
        publish: "2011",
        edition: "2015"
    },
    {
        title: "Educated",
        genre: "Biography",
        publish: "2018",
        edition: "2020"
    },
    {
        title: "The Hobbit",
        genre: "Fantasy",
        publish: "1937",
        edition: "2012"
    },
    {
        title: "Atomic Habits",
        genre: "Self-Help",
        publish: "2018",
        edition: "2022"
    }
]

// let myarr = books.filter((item) => {
//     return item.genre ==="History";
// })

// let myarr = books.filter((item) => {
//     return item.edition > 2004;
// })

let myarr = books.filter((item) => {
    return item.edition > 2004 && item.genre === "History";
})
console.log(myarr); 

