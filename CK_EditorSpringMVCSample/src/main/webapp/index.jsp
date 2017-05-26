<!DOCTYPE html>
<html>
<head>
<script src="${pageContext.request.contextPath}/resources/ckeditor/ckeditor.js"></script>
<title>Welcome From CK-Editor Spring MVC Project</title>
</head>
<body>
	<br />
	<br />
	<form method="post" action="show">
		<textarea name="editor1" id="editor1" rows="10" cols="80">
	              This is my textarea to be replaced with CKEditor.
	     </textarea>

		<script>
			CKEDITOR.replace('editor1');
		</script>

		<br /> <br />
		
		<button type="submit" name="test">Submit</button>

	</form>
</body>
</html>