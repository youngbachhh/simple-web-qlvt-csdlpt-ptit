function setTotal() {
    let quantity = document.getElementById("quantity").value;
    let price = document.getElementById("price").innerText;
    return (quantity * price);
}

document.getElementById("total").innerHTML = setTotal();

document.getElementById("quantity").onclick = function() {
    document.getElementById("total").innerText = setTotal();
}

