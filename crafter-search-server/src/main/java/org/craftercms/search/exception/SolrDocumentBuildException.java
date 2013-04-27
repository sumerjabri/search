/*
 * Copyright (C) 2007-2013 Crafter Software Corporation.
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.craftercms.search.exception;

/**
 * Thrown to indicate that an error occurred while building a Solr index update document.
 *
 * @author Alfonso Vásquez
 */
public class SolrDocumentBuildException extends SearchException {

    private static final long serialVersionUID = 4541121996907246722L;

    public SolrDocumentBuildException() {
    }

    public SolrDocumentBuildException(String s) {
        super(s);
    }

    public SolrDocumentBuildException(String s, Throwable throwable) {
        super(s, throwable);
    }

    public SolrDocumentBuildException(Throwable throwable) {
        super(throwable);
    }

}