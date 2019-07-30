(ns com.amazonaws.log.CommonsLogFactory
  "Internal logging factory for the signers and core classes based on Jakarta
  Commons Logging."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.log CommonsLogFactory]))

(defn ->commons-log-factory
  "Constructor."
  (^CommonsLogFactory []
    (new CommonsLogFactory )))

