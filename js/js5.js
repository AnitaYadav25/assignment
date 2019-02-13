
    var list =[
        {
            name: 'anita', age: 21, DOB:"20/12/1997",salary:55000
        },
        { name: 'namrata', age: 21, DOB:"30/3/1997",salary:40000
        },
        {
            name: 'sweta', age: 21, DOB:"30/4/1997",salary:60000
        },
        {
            name: 'xyz', age:29, DOB:"30/4/1997",salary:600
        },
        {
            name: 'abc', age:28, DOB:"30/4/1997",salary:16000
        },
        {
            name: 'sweta singh', age: 30, DOB:"30/4/1997",salary:600000
        }
    ];
    function call() {
        for (i in list) {
            console.log(list[i]);
            alert("name:"+list[i].name+" age:"+list[i].age+" DOB:"+list[i].DOB+" salary:"+list[i].salary);


        }
    }
        function salary(){
            for(i in list){
                if(list[i].salary>50000){
                    alert("name:"+list[i].name+" age:"+list[i].age+" DOB:"+list[i].DOB+" salary:"+list[i].salary);
                }
            }
        }
    function age(){
        for(i in list)
        {
            if((list[i].age>20)&& (list[i].salary<1000)){
                alert("name:" + list[i].name + " age:" + list[i].age + " DOB:" + list[i].DOB + " salary:" + list[i].salary);
                list[i].salary=list[i].salary+(5*list[i].salary);
                alert("incremented salary of the employee  "+list[i].name+"is "+list[i].salary);
            }

        }
    }

    function group(){
        var duplicate =[];
        var store=[];
        for(i in list)
        {

        for(let i = 0;i <list.length; i++)
        {
            if(duplicate.indexOf(list[i].age) == -1)
            {
                duplicate.push(list[i].age)
            }
        }

        }
        for(let i=0;i<duplicate.length;i++) {
                          console.log("the details of the employee under the age"+duplicate[i]);
            for (j = 0; j < list.length; j++) {
                if (list[j].age === duplicate[i]) {
                    console.log(list[i]);
                }


            }
           

        }
    }


