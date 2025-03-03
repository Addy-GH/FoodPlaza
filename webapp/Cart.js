function totall(){
	
	fname = document.getElementById('fname').value;
	quan = document.getElementById('fquantity').value;
	price = document.getElementById('fprice').value;
	totall = price * quan;
	
	document.getElementById('tprice').value = totall;
	
}


	function searchdatas(a){
		
		var fname1 = document.getElementById("fname").value;
		var price1 = document.getElementById("fprice").value;
		
		let xhr = new XMLHttpRequest();
		
		//process the request
		xhr.onreadystatechange = () => {
			if(xhr.status == 200 && xhr.readyState == 4){
				console.log("data send success....");				
			}
			
		}
		
		//prepare the request
		xhr.open("POST", "Add2Data.jsp?q="+a+"&fname="+fname1+"&price="+price1, true );
		
		//send the request
		xhr.send();
		
	}