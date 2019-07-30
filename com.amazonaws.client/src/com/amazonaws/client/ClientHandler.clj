(ns com.amazonaws.client.ClientHandler
  "Client interface to invoke an API."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.client ClientHandler]))

(defn ->client-handler
  "Constructor."
  (^ClientHandler []
    (new ClientHandler )))

(defn execute
  "Execute's a web service request. Handles marshalling and unmarshalling of data and making the
   underlying HTTP call(s).

  execution-params - Parameters specific to this invocation of an API. - `com.amazonaws.client.ClientExecutionParams`

  returns: Unmarshalled output POJO type. - `<Input,Output> Output`"
  ([^ClientHandler this ^com.amazonaws.client.ClientExecutionParams execution-params]
    (-> this (.execute execution-params))))

(defn shutdown
  "Shutdown and release any underlying resources."
  ([^ClientHandler this]
    (-> this (.shutdown))))

