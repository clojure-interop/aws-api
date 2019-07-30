(ns com.amazonaws.ApacheHttpClientConfig
  "Used for Apache HTTP client specific custom configurations."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws ApacheHttpClientConfig]))

(defn get-ssl-socket-factory
  "Returns a custom Apache HTTP client specific SSL socket factory;
   or null if there is none.

  returns: `org.apache.http.conn.socket.ConnectionSocketFactory`"
  (^org.apache.http.conn.socket.ConnectionSocketFactory [^ApacheHttpClientConfig this]
    (-> this (.getSslSocketFactory))))

(defn set-ssl-socket-factory
  "Sets a custom Apache HTTP client specific SSL socket factory.

  ssl-socket-factory - a custom Apache HTTP client specific SSL socket factory; or null if there is none. - `org.apache.http.conn.socket.ConnectionSocketFactory`"
  ([^ApacheHttpClientConfig this ^org.apache.http.conn.socket.ConnectionSocketFactory ssl-socket-factory]
    (-> this (.setSslSocketFactory ssl-socket-factory))))

(defn with-ssl-socket-factory
  "Fluent API for setting a custom Apache HTTP client specific SSL socket
   factory.

  ssl-socket-factory - a custom Apache HTTP client specific SSL socket factory; or null if there is none. - `org.apache.http.conn.socket.ConnectionSocketFactory`

  returns: `com.amazonaws.ApacheHttpClientConfig`"
  (^com.amazonaws.ApacheHttpClientConfig [^ApacheHttpClientConfig this ^org.apache.http.conn.socket.ConnectionSocketFactory ssl-socket-factory]
    (-> this (.withSslSocketFactory ssl-socket-factory))))

