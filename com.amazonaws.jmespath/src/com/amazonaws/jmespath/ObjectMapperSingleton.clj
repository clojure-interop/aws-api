(ns com.amazonaws.jmespath.ObjectMapperSingleton
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.jmespath ObjectMapperSingleton]))

(defn *get-object-mapper
  "returns: `com.fasterxml.jackson.databind.ObjectMapper`"
  (^com.fasterxml.jackson.databind.ObjectMapper []
    (ObjectMapperSingleton/getObjectMapper )))

