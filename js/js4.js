
function copy() {
    var obj = [{
        "name": "anita",
        "age": 22,
        "degree": "B.tech",
        "college": "rkgit"
    },
        {
            "name":"namrata",
            "age":22,
            "degree":"B.tech",
            "college":"Rkgit"
        },
        ];
    var obj2={};
    for (i=0;i<obj.length;i++) {

        obj2[i] = obj[i];

    }
    console.log(obj2);
}