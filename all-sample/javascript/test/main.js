"use strict"


/* --------------search button-------------*/


function click_search_btn(){

    let names = document.querySelectorAll(".list-table-name");
    let search_name = document.getElementById("search_name_area").value;


    for (let i = 0; i < names.length; i++) {
        const element = names[i];
        let name = element.querySelector("a").textContent;

        element.parentElement.classList.remove("hide");

        if (name !== search_name) {
            element.parentElement.classList.add("hide");
        }
    }

    return false;
}


/* --------------delete button-------------*/


function click_delete_btn(){

    var e = e || window.event;
    let btn = e.target;
    let tr = btn.parentElement.parentElement;

    tr.parentElement.removeChild(tr);

    return false;
}


/* --------------change button-------------*/


function click_change_btn(){

    let input_table = document.querySelector(".input-part");

    input_table.classList.toggle("hide");


    return false;

}


/* --------------ok button--------------*/

//get input

let inputs = [
    "input_table_number",
    "input_table_name",
    "input_table_brithday",
    "input_table_country",
    "input_table_sex"
]

function get_input(id) {return document.getElementById(id).value};



//create element


function create_elems(){

    let new_row = document.createElement("tr");
    let input_table = document.querySelector(".table-part table");
    let delete_btn = document.createElement("button");
    let change_btn = document.createElement("button");

    let delete_btn_td = document.createElement("td");
    let change_btn_td = document.createElement("td");

    delete_btn.textContent = "削除"; 
    delete_btn.addEventListener("click",() => {
        click_delete_btn();
    })

    change_btn.textContent = "変更"; 
    change_btn.addEventListener("click",() => {
        click_change_btn();
    })
    
    delete_btn_td.appendChild(delete_btn);
    change_btn_td.appendChild(change_btn);


    for (let i = 0; i < inputs.length; i++) {
        let new_td = document.createElement("td");
        const element = inputs[i];
        new_td.textContent = get_input(element);
        new_row.appendChild(new_td);
    }

    new_row.appendChild(delete_btn_td);
    new_row.appendChild(change_btn_td);
    
    input_table.appendChild(new_row);

}


// run function


function click_ok_btn(){

    create_elems();
    change_name_to_link();

    return false;
}



/* --------------change name to link-------------- */


function change_name_to_link(){
    let names = document.querySelectorAll(".list-table-name");

    name_td_add_class();

    for (let i = 0; i < names.length; i++) {
        const element = names[i];
        let original_text = element.textContent; 

        let a = document.createElement("a");
        a.href = "https://www.google.com";
        a.textContent = original_text;

        element.textContent = "";
        element.appendChild(a);

    }
}

function name_td_add_class(){
    let name_tds = document.querySelectorAll("#info_table tr td:nth-child(2)");
    
    for (let i = 0; i < name_tds.length; i++) {
        const element = name_tds[i];
        element.classList.add("list-table-name");
    }
}


/* reference

https://ferret-plus.com/8049


*/

