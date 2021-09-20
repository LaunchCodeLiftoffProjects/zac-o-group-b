let expirationInputYear = window.prompt("Enter expiration year:");
let expirationInputMonth = window.prompt("Enter expiration month:");
let expirationInputDay = window.prompt("Enter expiration day:");

let expirationInput = [expirationInputYear, (Number.expirationInputMonth - 1), expirationInputDay]

expiration = new Date();

function setExpirationDate(expirationInput){
let newExpirationInput = expiration.setFullYear(expirationInput)
return newExpirationDate
};

console.log(setExpirationDate(2021, 12, 15))

const d = new Date();
d.setFullYear(2020, 11, 3);
console.log(d)


    /* <script type="text/javascript">
        function myFunction(){
          var x=document.getElementById("box");
          number.push=document.getElementById("input").value;
          x.innerHTML=number.join('<br/>'); 
        } */

//need to take in user info for expiration date 
//set months 1-12 or alter user input to 0-11 i.e
//"[userInputMonth - 1]"
//create object of expiration dates 

// this is reference for pushing user input into an array
var addperson = prompt("Would you like to add someone yes or no?( you must type 'yes' in this exact way)");
if (addperson == "yes") {
  var firstName = prompt("What is this person's first name?");
  var lastName = prompt("What is this person's last name?");
  var age = prompt("How old is this person?");
  var email = prompt("What is their email adress?");
  if (!/^[@]+$/.test(email) || !email) {
    alert("Your email is valid");
  } else {
    alert("You did not give a valid email please re-type it, and make sure you include the @ symbol");
  }
  newPeople(firstName, lastName, age, email);
}

function newPeople(firstName, lastName, age, email) {
  var something = [];
  something.push({
    "FirstName": firstName,
    "LastName": lastName,
    "Age": age,
    "Email": email
  });
  console.log(something);
}

