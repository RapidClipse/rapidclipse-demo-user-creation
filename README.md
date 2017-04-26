# RapidClipse Demo: User creation
This demo project shows the handling of the user creation with a custom encrypted password.
### Get the Project running
Clone the GIT Reporsitory or use the import function of RapiClipse.
### RapidClipse import function
```java
File -> Import -> RapidClipse -> Demo Projects -> "rapidclipse-demo-user-creation"
```
### Troubleshooting
1. Sometimes you can fix project errors by running a Maven update. "Right click on the project" > "Maven" > "Update Project".
### Important project configuration
1. Connect to your H2 Northwind database with the ["Data Source Explorer"](https://rapidclipse.atlassian.net/wiki/display/DOCEN/Data+Source+Explorer) view in RapidClipse.
2. Open the schema.ddl file and export the script to your H2 Northwind database. The DDL file is located under "res/ddl/schema.ddl". See ["Run DDL scripts"](https://rapidclipse.atlassian.net/wiki/pages/viewpage.action?pageId=50659557)
3. Now you can run the application with the "Start UI" function in the ["Quick Launch"](https://rapidclipse.atlassian.net/wiki/display/DOCEN/Quick+Launch) view.
### How to encrypt the value from a PasswordField
see 'MainView'
```java
final String password = this.txtPassword.getValue();
//You can choose between SHA2, SHA1, MD5 or PBKDF2WithHmacSHA1.
final byte[] firstPassword = new HashStrategy.SHA2().hashPassword(password.getBytes());
```
### How to compare two byte arrays
see 'MainView'
```java
final byte[] firstPassword = new HashStrategy.SHA2().hashPassword(password.getBytes());
final byte[] secondPassword = new HashStrategy.SHA2().hashPassword(password2.getBytes());

if(Arrays.equals(firstPassword, secondPassword))
{
	//...
}
```
