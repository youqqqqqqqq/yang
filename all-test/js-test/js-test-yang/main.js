"use strict";

let input_ids = [
    "first_name_kannji",
    "second_name_kannji",
    "first_name_kana",
    "second_name_kana",
    "sex"
];

let target_ids = [
    "first_name_kannji_result",
    "second_name_kannji_result",
    "first_name_kana_result",
    "second_name_kana_result",
    "sex_result"
];

let infos = ["姓(漢字)", "名(漢字)", "姓(カナ)", "名(カナ)"];

let has_complete_input = true;
let error_name = [];

function setResults() {

    for (let i = 0; i < target_ids.length; i++) {

        let _input_id = input_ids[i];
        let _target_id = target_ids[i];


        setInputResult(_target_id, _input_id);

        if (i === 5) continue;

        nullCheck(_input_id, i);

    }

    setCheckboxResult();

}


function nullCheck(id, index) {
    let input = document.getElementById(id).value;
    if (input === "") {

        error_name.push(infos[index]);
        
        has_complete_input = false;
    }
}

function setInputResult(target_id, input_id) {
    let result = document.getElementById(input_id).value;
    let text = document.getElementById(target_id);
    text.textContent = result;
}

function setCheckboxResult() {
    let hobbies = document.getElementById("hobby").children;
    let text = document.getElementById("hobby_result");
    let checkedHbobbies = [];

    for (let i = 0; i < hobbies.length; i++) {
        const element = hobbies[i];

        if (element.checked) {
            checkedHbobbies.push(element.value);
        }
    }

    text.textContent = (checkedHbobbies.length === 0) ?
        "選択されていません" :
        checkedHbobbies.join(" , ");
}


function displayResult() {

    document.getElementById("result").classList.add("undisplay");

    checkAllInput()
    resetValue();

}


function checkAllInput(){
    if (has_complete_input) {
        document.getElementById("result").classList.toggle("undisplay");
    } else {
        alert(error_name.join(" , ") + "が入力されていません");
    }
}

function resetValue(){
    error_name.length = 0;
    has_complete_input = true;
}


