
# AESEncrypt

A Java tool to encrypt/decrypt files with AES encryption (based on code from PalaForge)


## Installation

First, download the .jar file from the [latest release](https://github.com/rastiqdev/AESEncrypt/releases/latest)

Then, create a new Java project on your IDE.

Import the .jar file as a dependency.

To encrypt a file, write : 

```java
AESEncrypt.instance.encrypt(key, inputFile, outputFile);
```

Where key represents the encrypting key (must be a string that is 16 characters long), inputFile represents the file that you are going to encrypt (must be a java.io.File) and outputFile represents the encrypted file that will be created (must be a java.io.File)

To decrypt a file, write : 

```java
AESEncrypt.instance.decrypt(key, inputFile, outputFile);
```

Where key represents the key to decrypt the file (must be a string), inputFile represents the file that you are going to decrypt (must be a java.io.File) and outputFile represents the decrypted file that will be created (must be a java.io.File)
