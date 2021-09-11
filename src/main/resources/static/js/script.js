function createGroceryItem() {
    let shoppingList = JSON.parse(localStorage.getItem('shoppinglist') || "[]");
    let itemName = document.getElementById('itemName');
    let expires = document.getElementById('expires');
    let groceryItem = {item: itemName.value, expires: expires.value};
    shoppingList.push(groceryItem);
    localStorage.setItem('shoppinglist', JSON.stringify(shoppingList));
    let listItem = document.createElement("P");
    listItem.innerHTML = '<label class="list-group-item"><input class="form-check-input me-2" type="checkbox" value="">' + " " + itemName.value + '</label>';
    document.getElementById('shoppinglist').appendChild(listItem);
    itemName.value = "";
    expires.value = "";


}

function displayList() {
    let parsedStorage = JSON.parse(localStorage.getItem('shoppinglist') || "[]");
    let list = document.getElementById('shoppinglist');

    for(let item in parsedStorage) {
      let itemName = parsedStorage[item].item;
      let expires = parsedStorage[item].expires;
      let listItem = document.createElement("P");
      listItem.innerHTML = '<label class="list-group-item"><input class="form-check-input me-2" type="checkbox" value="">' + " " + itemName + '</label>';
      list.appendChild(listItem);

    }
}

function deleteAll() {
  localStorage.clear();
  let deleteList = document.getElementById("shoppinglist");
  while(deleteList.hasChildNodes()) {
    deleteList.removeChild(deleteList.firstChild);
  }
}