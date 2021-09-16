# Cliente Registration Java GUI

---

![alt text](https://github.com/bsperezb/Client-registration-java/blob/main/registration.gif "Client registration")

---

<p> This project was created as a solution to challenge 5 of MisionTIC 2022. it was developed using Java, jbdc module, Swing and Mysql. </p>

### Quick setup
1. Launch the MySQL Command-Line Client. To launch the client, enter the following command in a Command Prompt window: mysql -u root -p .
<br>

2. Create Mysql Database:


``` sql
drop if exists Reto5;
create schema Reto5;
drop if exists CLIENTE;
create table CLIENTE;
ID integer foreign key  auto_increment;
DOC_INDENTIDAD integer not null;
NOMBRES varchar(100) not null;
APELLIDOS varchar(100) not null;
TELEFONO integer not null;
```
<br>

3. Run the java main class on `src/Vista/vistaCliente.java`.
<br>

4. Enjoy
