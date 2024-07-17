
USE biblioteca;

CREATE TABLE autores (
    autorID INT AUTO_INCREMENT PRIMARY KEY,
    nomeAutor VARCHAR(100),
    paisOrigem VARCHAR(50),
    dataNascimento DATE,
    biografia TEXT
);

CREATE TABLE livros (
    livroID INT AUTO_INCREMENT PRIMARY KEY,
    titulo VARCHAR(255),
    anoPublicacao YEAR,
    genero VARCHAR(50),
    quantidadeDisponivel INT,
    FOREIGN KEY (livroID) REFERENCES autores(autorID)
);

CREATE TABLE usuarios (
    usuarioID INT AUTO_INCREMENT PRIMARY KEY,
    nomeUsuario VARCHAR(100),
    email VARCHAR(100),
    senha VARCHAR(100),
    dataRegistro DATE
);

CREATE TABLE emprestimos (
    emprestimoID INT AUTO_INCREMENT PRIMARY KEY,
    usuarioID INT,
    livroID INT,
    dataEmprestimo DATE,
    dataDevolucaoPrevista DATE,
    Status ENUM('Em andamento', 'Devolvido', 'Atrasado'),
    FOREIGN KEY (usuarioID) REFERENCES usuarios(usuarioID),
    FOREIGN KEY (livroID) REFERENCES livros(livroID)
);