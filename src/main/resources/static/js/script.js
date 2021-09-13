function createGroceryItem() {
    let shoppingList = JSON.parse(localStorage.getItem('shoppinglist') || "[]");
    let itemName = document.getElementById('itemName');
    let expires = document.getElementById('expires');
    let groceryItem = {item: itemName.value, expires: expires.value};
    shoppingList.push(groceryItem);
    localStorage.setItem('shoppinglist', JSON.stringify(shoppingList));
    let listItem = document.createElement("P");
    listItem.setAttribute("name", "list_item")
    listItem.innerHTML = '<label class="list-group-item"><input name="check" class="form-check-input me-2" type="checkbox" value="">' + " " + itemName.value + '</label>';
    document.getElementById('shoppinglist').appendChild(listItem);
    itemName.value = "";
    expires.value = "";
}

function createFridgeItem() {
    let parsedFridgeList = JSON.parse(localStorage.getItem('fridge') || "[]");
    let itemName = document.getElementById('itemName');
    let expires = document.getElementById('expires');
    let groceryItem = {item: itemName.value, expires: expires.value};
    parsedFridgeList.push(groceryItem);
    localStorage.setItem('fridge', JSON.stringify(parsedFridgeList));
    let listItem = document.createElement("P");
    listItem.setAttribute("name", "list_item")
    listItem.innerHTML = '<label class="list-group-item"><input name="check" class="form-check-input me-2" type="checkbox" value="">' + " " + itemName.value +
    "-" + " expires: " + '<span style="text-align: right">' + expires.value + '</span></label>';
    document.getElementById('fridge').appendChild(listItem);
    itemName.value = "";
    expires.value = "";
}

function displayShoppingList() {
    let parsedShoppingList = JSON.parse(localStorage.getItem('shoppinglist') || "[]");
    let list = document.getElementById('shoppinglist');
    for(let item in parsedShoppingList) {
      let itemName = parsedShoppingList[item].item;
      let expires = parsedShoppingList[item].expires;
      let listItem = document.createElement("P");
      listItem.setAttribute("name", "list_item")
      listItem.innerHTML = '<label class="list-group-item"><input name="check" type="checkbox" value="">' + " " + itemName + '</label>'
      list.appendChild(listItem);
    }
}

  function displayFridge() {
      let parsedStorage = JSON.parse(localStorage.getItem('fridge') || "[]");
      let list = document.getElementById('fridge');
      for(let item in parsedStorage) {
        let itemName = parsedStorage[item].item;
        let expires = parsedStorage[item].expires;
        let newItem = document.createElement("P");
        newItem.setAttribute("name", "list_item")
        newItem.innerHTML = '<label class="list-group-item"><input name="check" class="form-check-input me-2" type="checkbox" value="">' + itemName + " " +
          "-" + " expires: " + '<span style="text-align: right">' + expires + '</span></label>';
        document.getElementById('fridge').appendChild(newItem);

      }
}

function deleteSelectedShoppingList() {
  let parsedShoppingList = JSON.parse(localStorage.getItem('shoppinglist') || "[]");
  let listItem = document.getElementsByName("list_item");
  let selected = document.getElementsByName("check");

  for(let i=0; i < listItem.length; i++) {
    let deleted = listItem.item(i).innerHTML;
    if(selected.item(i).checked && deleted.includes(parsedShoppingList[i].item)) {
        console.log(parsedShoppingList[i].item);
        let destroy = listItem.item(i).remove();
        parsedShoppingList.splice(i, 1);
        localStorage.setItem('shoppinglist', JSON.stringify(parsedShoppingList));
    }
  }

}

function deleteSelectedFridge() {
  let parsedFridgeList = JSON.parse(localStorage.getItem('fridge') || "[]");
  let listItem = document.getElementsByName("list_item");
  let selected = document.getElementsByName("check");

  for(let i=0; i < listItem.length; i++) {
    let deleted = listItem.item(i).innerHTML;
    if(selected.item(i).checked && deleted.includes(parsedFridgeList[i].item)) {
        console.log(parsedFridgeList[i].item);
        let destroy = listItem.item(i).remove();
        parsedFridgeList.splice(i, 1);
        localStorage.setItem('fridge', JSON.stringify(parsedFridgeList));
    }
  }

}

function moveSelected() {
  let parsedShoppingList = JSON.parse(localStorage.getItem('shoppinglist') || "[]");
  let inFridge = JSON.parse(localStorage.getItem('fridge') || "[]");
  let listItem = document.getElementsByName("list_item");
  let selected = document.getElementsByName("check");

  for(let i=0; i < listItem.length; i++) {
    let moved = listItem.item(i).innerHTML;
    if(selected.item(i).checked && moved.includes(parsedShoppingList[i].item)) {
        let itemName = parsedShoppingList[i].item;
        let expires = parsedShoppingList[i].expires;
        let moveItem = {item: itemName, expires: expires};
        inFridge.push(moveItem);

        localStorage.setItem('fridge', JSON.stringify(inFridge));

        let destroy = listItem.item(i).remove();
        parsedShoppingList.splice(i, 1);
        localStorage.setItem('shoppinglist', JSON.stringify(parsedShoppingList));
    }
  }
}

function deleteAllShoppingList() {
  localStorage.removeItem('shoppinglist');
  let deleteList = document.getElementById("shoppinglist");
  while(deleteList.hasChildNodes()) {
    deleteList.removeChild(deleteList.firstChild);
  }
}


function deleteAllFridge() {
  localStorage.removeItem('fridge');
  let deleteList = document.getElementById("fridge");
  while(deleteList.hasChildNodes()) {
    deleteList.removeChild(deleteList.firstChild);
  }
}