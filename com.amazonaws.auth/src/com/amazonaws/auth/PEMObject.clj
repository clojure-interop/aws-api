(ns com.amazonaws.auth.PEMObject
  "A PEM object in a PEM file.

  A PEM file can contain one or multiple PEM objects, each with a beginning
  and ending marker."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.auth PEMObject]))

(defn ->pem-object
  "Constructor.

  begin-marker - `java.lang.String`
  der-bytes - `byte[]`"
  (^PEMObject [^java.lang.String begin-marker der-bytes]
    (new PEMObject begin-marker der-bytes)))

(defn get-begin-marker
  "returns: `java.lang.String`"
  (^java.lang.String [^PEMObject this]
    (-> this (.getBeginMarker))))

(defn get-der-bytes
  "returns: `byte[]`"
  ([^PEMObject this]
    (-> this (.getDerBytes))))

(defn get-pem-object-type
  "returns: `com.amazonaws.auth.PEMObjectType`"
  (^com.amazonaws.auth.PEMObjectType [^PEMObject this]
    (-> this (.getPEMObjectType))))

