(ns com.amazonaws.handlers.HandlerChainFactory
  "Factory for creating request/response handler chains."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.handlers HandlerChainFactory]))

(defn ->handler-chain-factory
  "Constructor."
  (^HandlerChainFactory []
    (new HandlerChainFactory )))

(defn new-request-handler-chain
  "For backward compatibility, constructs a new request handler chain adapted to RequestHandler2 by analyzing the
   specified classpath resource.

  resource - The resource to load from the classpath containing the list of request handlers to instantiate. - `java.lang.String`

  returns: A list of request handlers based on the handlers referenced in the specified resource. - `java.util.List<com.amazonaws.handlers.RequestHandler2>`"
  (^java.util.List [^HandlerChainFactory this ^java.lang.String resource]
    (-> this (.newRequestHandlerChain resource))))

(defn new-request-handler-2-chain
  "Constructs a new request handler (v2) chain by analyzing the specified classpath resource.

  resource - The resource to load from the classpath containing the list of request handlers to instantiate. - `java.lang.String`

  returns: A list of request handlers based on the handlers referenced in the specified resource. - `java.util.List<com.amazonaws.handlers.RequestHandler2>`"
  (^java.util.List [^HandlerChainFactory this ^java.lang.String resource]
    (-> this (.newRequestHandler2Chain resource))))

(defn get-global-handlers
  "returns: `java.util.List<com.amazonaws.handlers.RequestHandler2>`"
  (^java.util.List [^HandlerChainFactory this]
    (-> this (.getGlobalHandlers))))

