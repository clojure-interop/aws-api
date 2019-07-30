(ns com.amazonaws.util.ImmutableMapParameter$Builder
  "A convenient builder for creating ImmutableMapParameter instances."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.util ImmutableMapParameter$Builder]))

(defn ->builder
  "Constructor."
  (^ImmutableMapParameter$Builder []
    (new ImmutableMapParameter$Builder )))

(defn put
  "Add a key-value pair into the built map. The method will throw
   IllegalArgumentException immediately when duplicate keys are
   provided.

  key - `K`
  value - `V`

  returns: Returns a reference to this object so that method calls can
           be chained together. - `com.amazonaws.util.ImmutableMapParameter$Builder<K,V>`"
  (^com.amazonaws.util.ImmutableMapParameter$Builder [^ImmutableMapParameter$Builder this key value]
    (-> this (.put key value))))

(defn build
  "Generates and returns a new ImmutableMapParameter instance which
   contains all the entries added into the Builder by put()
   method.

  returns: `com.amazonaws.util.ImmutableMapParameter<K,V>`"
  (^com.amazonaws.util.ImmutableMapParameter [^ImmutableMapParameter$Builder this]
    (-> this (.build))))

