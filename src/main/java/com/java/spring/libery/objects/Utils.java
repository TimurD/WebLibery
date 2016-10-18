package com.java.spring.libery.objects;

import com.java.spring.libery.enums.SearchType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;

import javax.faces.context.FacesContext;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by timur_000 on 17.10.2016.
 */
@Component
public class Utils{
    private SearchType searchType=SearchType.TITLE;
    private Map<String ,SearchType>searchTypeMap =new HashMap<String, SearchType>();

    @Autowired
    MessageSource msg;

    private Character[] letters = new Character[]{'А', 'Б', 'В', 'Г', 'Д', 'Е', 'Ё', 'Ж', 'З', 'И', 'Й', 'К', 'Л', 'М', 'Н', 'О', 'П', 'Р', 'С', 'Т', 'У', 'Ф', 'Х', 'Ц', 'Ч', 'Ш', 'Щ', 'Ъ', 'Ы', 'Ь', 'Э', 'Ю', 'Я'};

    public Character[] getLetters() {
        return letters;
    }

    public SearchType getSearchType() {
        return searchType;
    }

    public void setSearchTypeMap(Map<String, SearchType> searchTypeMap) {
        this.searchTypeMap = searchTypeMap;
    }

    public Map<String ,SearchType>getSearchTypeMap(){
        searchTypeMap.clear();
        searchTypeMap.put(msg.getMessage("author_name",null, FacesContext.getCurrentInstance().getViewRoot().getLocale()),searchType.AUTHOR);
        searchTypeMap.put(msg.getMessage("book_name",null, FacesContext.getCurrentInstance().getViewRoot().getLocale()),searchType.TITLE);
        return searchTypeMap;
    }
}


