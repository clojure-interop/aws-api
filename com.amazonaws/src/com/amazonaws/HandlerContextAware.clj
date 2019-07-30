(ns com.amazonaws.HandlerContextAware
  "An implementing object is capable of storing context that is visible to all RequestHandler2.

  This interface is subject to change and should not be implemented by users of the SDK."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws HandlerContextAware]))

(defn add-handler-context
  "Adds a context to that is visible to all RequestHandler2s.

   Note that, context added here will available only for the scope of
   the request execution and will not be marshalled over the wire.

  key - the key for the property being set in the request. - `com.amazonaws.handlers.HandlerContextKey`
  value - the value for the property being set in the request. - `X`

  returns: `<X> void`"
  ([^HandlerContextAware this ^com.amazonaws.handlers.HandlerContextKey key value]
    (-> this (.addHandlerContext key value))))

(defn get-handler-context
  "Return the context for the given key if present; else return null.

  key - the key for the context - `com.amazonaws.handlers.HandlerContextKey`

  returns: the context if present else null. - `<X> X`"
  ([^HandlerContextAware this ^com.amazonaws.handlers.HandlerContextKey key]
    (-> this (.getHandlerContext key))))

