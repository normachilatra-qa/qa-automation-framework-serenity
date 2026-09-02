# language: es
@Regression
Característica: Autenticación de Usuario en la Plataforma
  Como usuario registrado de la aplicación
  Quiero ingresar con mis credenciales válidas
  Para acceder al panel principal del sistema

  @SmokeTest @LoginExitoso
  Escenario: Inicio de sesión exitoso con credenciales válidas
    Dado que el usuario se encuentra en la página de inicio de sesión
    Cuando ingresa el usuario "qa_admin" y la contraseña "Password123*"
    Entonces debería ver el mensaje de bienvenida "Bienvenido al Dashboard"
