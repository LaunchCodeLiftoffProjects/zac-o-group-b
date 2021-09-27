const groceryObjectList = [];
class Grocery_List_Class {
  constructor(item) {
    this.ulElement =item;
  }

  add() {
    const groceryInput = document.querySelector("#userInput").value;
    if (groceryInput == "") {
      alert("Please enter item name")
    } else {
      const groceryObject = {
        id: groceryObjectList.length,
        groceryText: groceryInput,
        isDone: false, //sets default as false therefore not triggering checked 
      }

      groceryObjectList.unshift(groceryObject);
      this.display();
      document.querySelector("#userInput").value = '';
    }
  }
//isDone is returning undefined 
  done_undone(x) {
    const selectedGroceryIndex = groceryObjectList.findIndex((item)=> item.id == x);
    //cannot read properties of undefined 
    console.log(groceryObjectList[selectedGroceryIndex].isDone); 
    groceryObjectList[selectedGroceryIndex].isDone == false ? groceryObjectList[
      selectedGroceryIndex].isDone = true : groceryObjectList[selectedGroceryIndex].isDone = false;
      this.display(); //switch false to true vice versa and call checked class in css later in display()
  }

  deleteElement(z) {
    const selectedDelIndex = groceryObjectList.findIndex((item)=> item.id == z);
    groceryObjectList.splice(selectedDelIndex,1);
    this.display();
  }

  display() {
    //need to add display of check boxes, then uncomment icons in HTML 
    //algorythm refreshes each time with new input, therefore needs to be cleared 
    this.ulElement.innerHTML = "";

    groceryObjectList.forEach((object_item) => {
      const liElement = document.createElement("li");
      const delBtn = document.createElement("i"); 
      //const emptyCheck = document.createElement("i")
      //const activeCheck = document.createElement("i")

      liElement.innerText = object_item.groceryText;
      liElement.setAttribute("data-id", object_item.id);

      delBtn.setAttribute("data-id", object_item.id);
      delBtn.classList.add("far", "fa-trash-alt");

      //emptyCheck.setAttribute("data-id", object_item.id);
      //emptyCheck.classList.add("far", "fa-square");

      //activeCheck.setAttribute("date-id", object_item.id);
      //activeCheck.classList.add("far", "fa-check-square");

      liElement.appendChild(delBtn);
      //liElement.appendChild(emptyCheck);
      //liElement.appendChild(activeCheck);

      delBtn.addEventListener("click", function(e) {
        const deleteId = e.target.getAttribute("data-id");
        groceryList.deleteElement(deleteId);
        
      })


      
      liElement.addEventListener("click", function(e) {
        const selectedId = e.target.getAttribute("data-id");
        groceryList.done_undone(selectedId);
      })
      
      if (object_item.isDone) {
        liElement.classList.add("checked");
      }

      this.ulElement.appendChild(liElement);

    })
  }
}

////------MAIN PROGRAM-------////

const listSection = document.querySelector("#myUl");
groceryList = new Grocery_List_Class(listSection);


//input on enter 
var el = document.getElementById("userInput");
  el.addEventListener("keyup", function(event) {
    if (event.key === "Enter") {
        groceryList.add()
    }
  })
//input on add button 
document.querySelector(".addBtn").addEventListener("click", function () {
  groceryList.add()
})
