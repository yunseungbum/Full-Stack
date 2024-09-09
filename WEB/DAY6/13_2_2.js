document.addEventListener("DOMContentLoaded",function(e){
 let nameEditButton = document.getElementById("nameEditButton");
 let editNameField = document.getElementById("editNameField");
 let okButton = document.getElementById("okButton");
 let newName = document.getElementById("newName");
 let nameHere = document.getElementById("nameHere");
  
 nameEditButton.addEventListener("click",function(e){
    editNameField.style.display = "block";
    nameEditButton.style.display = "none";
 })

 okButton.addEventListener("click",function(e){
    nameHere.textContent = newName.value;
    editNameField.style.display = "none";
    nameEditButton.style.display = "inline";
 })
})