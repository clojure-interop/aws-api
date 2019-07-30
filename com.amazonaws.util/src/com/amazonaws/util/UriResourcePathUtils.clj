(ns com.amazonaws.util.UriResourcePathUtils
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.util UriResourcePathUtils]))

(defn ->uri-resource-path-utils
  "Constructor."
  (^UriResourcePathUtils []
    (new UriResourcePathUtils )))

(defn *add-static-query-paramters-to-request
  "Identifies the static query parameters in Uri resource path for and adds it to
   request.

   Returns the updated uriResourcePath.

  request - `com.amazonaws.Request`
  uri-resource-path - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^com.amazonaws.Request request ^java.lang.String uri-resource-path]
    (UriResourcePathUtils/addStaticQueryParamtersToRequest request uri-resource-path)))

(defn *update-uri-host
  "Creates a new URI from the given URI by replacing the host value.

  uri - Original URI - `java.net.URI`
  new-host-prefix - New host for the uri - `java.lang.String`

  returns: `java.net.URI`"
  (^java.net.URI [^java.net.URI uri ^java.lang.String new-host-prefix]
    (UriResourcePathUtils/updateUriHost uri new-host-prefix)))

