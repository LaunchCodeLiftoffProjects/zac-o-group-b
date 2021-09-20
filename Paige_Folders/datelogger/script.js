    function returnInput(expirationInput){
      let expires = document.getElementById("expirationInput").value;
      //number.push(document.getElementById("expirationInput").value); ---for later, to place into an object that needs to be initiated
      console.log("input returned as variable")
      console.log(expires)
      return expires 
      }
//




      /*function() {
    $('#submit').on('click', function(){
      var date = new Date($('#expirationInput').val());
      day = date.getDate();
      month = date.getMonth() + 1;
      year = date.getFullYear();
      alert([day, month, year].join('/'));
    });*/


