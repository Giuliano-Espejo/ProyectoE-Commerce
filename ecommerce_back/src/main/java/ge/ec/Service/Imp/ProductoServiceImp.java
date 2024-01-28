package ge.ec.Service.Imp;

import ge.ec.Entity.Producto;
import ge.ec.Repository.ProductoRepository;
import ge.ec.Service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoServiceImp implements ProductoService {

    @Autowired
    private ProductoRepository productoRepository;

    @Override
    public List<Producto> findAll() {
        return productoRepository.findByDeletedFalse();
    }

    @Override
    public Producto findById(Long id) {
        return productoRepository.findById(id).orElseThrow(()->new NullPointerException("No se encontró el ID del producto, id N°: "+ id));
    }

    @Override
    public Producto update(Long id, Producto productoNuevo) {
        Producto p = productoRepository.findById(id).orElseThrow(()->new NullPointerException("No se encontró el ID del producto, id N°: "+ id));
        p.setTitulo(productoNuevo.getTitulo());
        p.setDescripcion(productoNuevo.getDescripcion());
        p.setImagen(productoNuevo.getImagen());
        p.setDeleted(productoNuevo.getDeleted());
        return productoRepository.save(p);
    }

    @Override
    public Producto save(Producto producto) {
        return productoRepository.save(producto);
    }

    @Override
    public void delete(Long id) {
        Producto p = productoRepository.findById(id).orElseThrow(()->new NullPointerException("No se encontró el ID del producto, id N°: "+ id));
        productoRepository.deleteById(id);
    }
}
