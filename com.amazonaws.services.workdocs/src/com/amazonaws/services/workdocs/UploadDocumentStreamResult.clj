(ns com.amazonaws.services.workdocs.UploadDocumentStreamResult
  "Result properties for UploadDocumentStream operation."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.workdocs UploadDocumentStreamResult]))

(defn ->upload-document-stream-result
  "Constructor.

  Initializes UploadDocumentStreamResult object.

  request - UploadDocumentStreamRequest object. - `com.amazonaws.services.workdocs.UploadDocumentStreamRequest`"
  (^UploadDocumentStreamResult [^com.amazonaws.services.workdocs.UploadDocumentStreamRequest request]
    (new UploadDocumentStreamResult request)))

(defn get-parent-folder-id
  "Gets destination folder ID.

  returns: Destination folder ID. - `java.lang.String`"
  (^java.lang.String [^UploadDocumentStreamResult this]
    (-> this (.getParentFolderId))))

(defn get-document-name
  "Gets document name.

  returns: Document name. - `java.lang.String`"
  (^java.lang.String [^UploadDocumentStreamResult this]
    (-> this (.getDocumentName))))

(defn get-content-type
  "Gets content type.

  returns: Content type. - `java.lang.String`"
  (^java.lang.String [^UploadDocumentStreamResult this]
    (-> this (.getContentType))))

(defn get-document-id
  "Gets document ID.

  returns: Document ID. - `java.lang.String`"
  (^java.lang.String [^UploadDocumentStreamResult this]
    (-> this (.getDocumentId))))

(defn get-version-id
  "Gets document version ID.

  returns: Document version ID. - `java.lang.String`"
  (^java.lang.String [^UploadDocumentStreamResult this]
    (-> this (.getVersionId))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^UploadDocumentStreamResult this]
    (-> this (.toString))))

(defn hash-code
  "returns: `int`"
  (^Integer [^UploadDocumentStreamResult this]
    (-> this (.hashCode))))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^UploadDocumentStreamResult this ^java.lang.Object obj]
    (-> this (.equals obj))))

