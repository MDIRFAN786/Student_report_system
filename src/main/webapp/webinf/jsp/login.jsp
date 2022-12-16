<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css"
        integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
    <title>Login</title>
    <style>
        body {
            background-color: powderblue;
        }

        h1 {
            color: black;
        }

        p {
            color: red;
        }
        input{
            padding: 10px 15px 10px 15px;
        }
        .login{
            display: flex;
            align-items: center;
            flex-direction: column;
            gap: 1rem;
            padding: 100px;
        }
    </style>
</head>

<body>
    <div class="login">
        <h1>Login</h1>
        <form action="/success" method="post">
            <input type="text" name="username" placeholder="username" />
            <br />
            <input type="password" name="password" placeholder="password" />
            <button type="submit" class="btn btn-primary">Submit</button>  
        </form>
        
          
    </div>
</body>

</html>