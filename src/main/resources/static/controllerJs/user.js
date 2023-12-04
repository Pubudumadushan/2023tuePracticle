window.addEventListener('load',()=>{


    userTblRefresh();
})


const userTblRefresh = ()=>{

   /* users = [
            {id:1, employee_id:{id:4, fullName:'Pubudu Madushan', callingName:'Pubudu'}, status:true, userName:'Pubudu', email:'pubudu@gmail.com', role_id:{id:2, name:'Manager'}},

            {id:2, employee_id:{id:5, fullName:'Kavidu Madushan', callingName:'Kavidu'}, status:false, userName:'Kavidu', email:'kavidu@gmail.com', role_id:{id:3, name:'Cashier'}}
            
        ];*/


    users = [];
    //call jquery function
    $.ajax("/user/findall",{

        async:false,
        type:"GET",
        contentType:"json",
        success: function (data){
          console.log("success"+data);
          users = data;
        },
        error: function (resOb){
          console.log("error"+resOb);
          users = [];
        }
      })

    
    const properties = [
                          {property:getEmployee_id, datatype:'function'},
                          {property:'username', datatype:'string'},
                          {property:'email', datatype:'string'},
                          {property:getRole_id, datatype:'function'},
                          {property:getStatus, datatype:'function'},
                        ];



    fillDataIntoTable(userTbl,users,properties);



}

getEmployee_id = (empName)=>{

    // return '<p>' +empName.employee_id.fullName+ '</p>';
    return "Employee"


}



getRole_id = (rolName)=>{

    // return '<p>'+rolName.role_id.name+'</p>';

    return "Role"

    
}


getStatus = (status)=>{

    if(status.status == true){

        return '<p>Active</p>';

    }else{

        return '<p>In-Active</p>';

    }
}





