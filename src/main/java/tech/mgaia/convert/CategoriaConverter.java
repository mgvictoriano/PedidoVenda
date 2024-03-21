package tech.mgaia.convert;

import jakarta.faces.convert.FacesConverter;
import jakarta.inject.Inject;
import jakarta.faces.convert.Converter;
import tech.mgaia.cdi.CDIServiceLocator;
import tech.mgaia.model.Categoria;
import tech.mgaia.repository.CategoriaRepository;

import jakarta.faces.component.UIComponent;
import jakarta.faces.context.FacesContext;

@FacesConverter(forClass = Categoria.class)
public class CategoriaConverter implements Converter {

    //@Inject
    private CategoriaRepository categorias;

    public CategoriaConverter() {
        categorias = CDIServiceLocator.getBean(CategoriaRepository.class);
    }

    @Override
    public Object getAsObject(FacesContext context, UIComponent component, String value) {
        Categoria retorno = null;

        if (value != null && !"".equals(value)) {
            Long id = new Long(value);
            retorno = categorias.porId(id);
        }
        return retorno;
    }

    @Override
    public String getAsString(FacesContext context, UIComponent component, Object value) {
        if (value != null) {
            Categoria categoria = (Categoria) value;
            return categoria.getId() == null ? null : categoria.getId().toString();
        }
        return "";
    }

}
