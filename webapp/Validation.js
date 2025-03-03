function AddFoodValidation(){
	
	fname = document.getElementById('fname').value;
	if(fname==""){
		document.getElementById('fnameerror').innerHTML="Please enter the name";
		return false;
	}
	
	ftype = document.getElementById('ftype').value;
		if(ftype==""){
			document.getElementById('ftypeerror').innerHTML="Please enter the type";
			return false;
		}
		
	fquantity = document.getElementById('fquantity').value;
		if(fquantity==""){
			document.getElementById('fquantityerror').innerHTML="Please enter the quanity";
			return false;
		}
			
	fprice = document.getElementById('fprice').value;
		if(fprice==""){
			document.getElementById('fpriceerror').innerHTML="Please enter the price";
			return false;
		}
		
		return true;

}


function AddCustValidation(){
	
	cname = document.getElementById('cname').value;
	if(cname==""){
		document.getElementById('cnameerror').innerHTML="Please enter the name";
		return false;
	}
	
	email = document.getElementById('email').value;
		if(email==""){
			document.getElementById('emailerror').innerHTML="Please enter the email";
			return false;
		}
		
	password = document.getElementById('password').value;
		if(password==""){
			document.getElementById('passerror').innerHTML="Please enter the password";
			return false;
		}
			
	adr = document.getElementById('adr').value;
		if(adr==""){
			document.getElementById('adrerror').innerHTML="Please enter the address";
			return false;
		}
		
	cNo = document.getElementById('cNo').value;
		if(cNo==""){
			document.getElementById('cNoerror').innerHTML="Please enter the contact No";
			return false;
		}
		
		return true;

}


function ChangePassValdiation(){
	
	email = document.getElementById('email').value;
		if(email==""){
			document.getElementById('emailerror').innerHTML="Please enter the email";
			return false;
		}
		
	pass = document.getElementById('pass').value;
		if(pass==""){
			document.getElementById('passerror').innerHTML="Please enter the password";
			return false;
		}
		
	npass = document.getElementById('npass').value;
		if(npass==""){
			document.getElementById('npasserror').innerHTML="Please enter the new password";
			return false;
		}
			
	cpass = document.getElementById('cpass').value;
		if(cpass==""){
			document.getElementById('cpasserror').innerHTML="Please enter the confirm password";
			return false;
		}
		
		return true;
			
}


function AddFeedbackValidation(){
	
	cname = document.getElementById('cname').value;
	if(cname==""){
		document.getElementById('cnameerror').innerHTML="Please enter the name";
		return false;
	}
	
	uemail = document.getElementById('uemail').value;
		if(uemail==""){
			document.getElementById('uemailerror').innerHTML="Please enter the email";
			return false;
		}
		
	review = document.getElementById('review').value;
		if(review==""){
			document.getElementById('reviewerror').innerHTML="Please enter the review";
			return false;
		}
			
	rank = document.getElementById('rank').value;
		if(rank==""){
			document.getElementById('rankerror').innerHTML="Please enter the rank";
			return false;
		}
		
	suggest = document.getElementById('suggest').value;
		if(suggest==""){
			document.getElementById('suggesterror').innerHTML="Please enter the suggestion";
			return false;
		}
		
		return true;

}


function LoginValidate(){
	
	email = document.getElementById('email').value;
		if(email==""){
			document.getElementById('emailerror').innerHTML="Please enter the email";
			return false;
		}
		
	pass = document.getElementById('pass').value;
		if(pass==""){
			document.getElementById('passerror').innerHTML="Please enter the password";
			return false;
		}
		
		return true;
			
}


function UpdateCustomerValidation(){
	
	cname = document.getElementById('cname').value;
	if(cname==""){
		document.getElementById('cnameerror').innerHTML="Please enter the name";
		return false;
	}
	
	email = document.getElementById('email').value;
		if(email==""){
			document.getElementById('emailerror').innerHTML="Please enter the email";
			return false;
		}
		
	password = document.getElementById('password').value;
		if(password==""){
			document.getElementById('passerror').innerHTML="Please enter the password";
			return false;
		}
			
	adr = document.getElementById('adr').value;
		if(adr==""){
			document.getElementById('adrerror').innerHTML="Please enter the address";
			return false;
		}
		
	cNo = document.getElementById('cNo').value;
		if(cNo==""){
			document.getElementById('cNoerror').innerHTML="Please enter the contact No";
			return false;
		}
		
		return true;

}


function UpdateFoodValidation(){
	
	fid = document.getElementById('fid').value;
		if(fid==""){
			document.getElementById('fiderror').innerHTML="Please enter the id";
			return false;
		}
	
	fname = document.getElementById('fname').value;
	if(fname==""){
		document.getElementById('fnameerror').innerHTML="Please enter the name";
		return false;
	}
	
	ftype = document.getElementById('ftype').value;
		if(ftype==""){
			document.getElementById('ftypeerror').innerHTML="Please enter the type";
			return false;
		}
		
	fquantity = document.getElementById('fquantity').value;
		if(fquantity==""){
			document.getElementById('fquantityerror').innerHTML="Please enter the quanity";
			return false;
		}
			
	fprice = document.getElementById('fprice').value;
		if(fprice==""){
			document.getElementById('fpriceerror').innerHTML="Please enter the price";
			return false;
		}
		
		return true;

}


function AddToCartValidation(){
	
	fid = document.getElementById('fid').value;
		if(fid==""){
			document.getElementById('fiderror').innerHTML="Please enter the id";
			return false;
		}
		
	email = document.getElementById('email').value;
		if(email==""){
			document.getElementById('emailerror').innerHTML="Please enter the email";
			return false;
		}
	
	fname = document.getElementById('fname').value;
	if(fname==""){
		document.getElementById('fnameerror').innerHTML="Please enter the name";
		return false;
	}
	
	ftype = document.getElementById('ftype').value;
		if(ftype==""){
			document.getElementById('ftypeerror').innerHTML="Please enter the type";
			return false;
		}
		
			
	fprice = document.getElementById('fprice').value;
		if(fprice==""){
			document.getElementById('fpriceerror').innerHTML="Please enter the price";
			return false;
		}
		
	tprice = document.getElementById('tprice').value;
		if(tprice==""){
			document.getElementById('tpriceerror').innerHTML="Please enter the quanity";
			return false;
		}
		
		return true;

}
