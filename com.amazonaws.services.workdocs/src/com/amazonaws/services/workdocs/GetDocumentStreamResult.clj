(ns com.amazonaws.services.workdocs.GetDocumentStreamResult
  "Result properties for GetDocumentStream operation.
  Once stream content is retrieved, result object must be closed."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.workdocs GetDocumentStreamResult]))

(defn ->get-document-stream-result
  "Constructor.

  Initializes GetDocumentStreamResult object.

  request - GetDocumentStreamRequest object. - `com.amazonaws.services.workdocs.GetDocumentStreamRequest`"
  (^GetDocumentStreamResult [^com.amazonaws.services.workdocs.GetDocumentStreamRequest request]
    (new GetDocumentStreamResult request)))

(defn get-document-id
  "Gets document ID.

  returns: Document ID. - `java.lang.String`"
  (^java.lang.String [^GetDocumentStreamResult this]
    (-> this (.getDocumentId))))

(defn get-version-id
  "Gets document version ID.

  returns: Document version ID. - `java.lang.String`"
  (^java.lang.String [^GetDocumentStreamResult this]
    (-> this (.getVersionId))))

(defn get-stream
  "Gets input stream of document.

  returns: Input stream of document. - `java.io.InputStream`"
  (^java.io.InputStream [^GetDocumentStreamResult this]
    (-> this (.getStream))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^GetDocumentStreamResult this]
    (-> this (.toString))))

(defn hash-code
  "returns: `int`"
  (^Integer [^GetDocumentStreamResult this]
    (-> this (.hashCode))))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^GetDocumentStreamResult this ^java.lang.Object obj]
    (-> this (.equals obj))))

(defn close
  "Closes underlying stream if specified.

  throws: java.io.IOException - IO Exception."
  ([^GetDocumentStreamResult this]
    (-> this (.close))))

