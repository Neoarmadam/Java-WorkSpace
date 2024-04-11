package Libreria;

	import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement
public class Libro {
	String isbn, titulo, autor;

	
	public Libro() {
		super();
	}
	
	public Libro(String isbn, String titulo, String autor) {
		super();
		this.isbn=isbn;
		this.titulo=titulo;
		this.autor=autor;
	}
	
	
	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	@Override
	public String toString() {
		return "Libro [isbn=" + isbn + ", titulo=" + titulo + ", autor=" + autor + "]";
	}
	
	
}
