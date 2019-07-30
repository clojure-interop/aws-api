(ns com.amazonaws.services.workdocs.UploadDocumentStreamRequest
  "Request parameters for UploadDocumentStream operation."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.workdocs UploadDocumentStreamRequest]))

(defn ->upload-document-stream-request
  "Constructor.

  Initializes UploadDocumentStreamRequest object."
  (^UploadDocumentStreamRequest []
    (new UploadDocumentStreamRequest )))

(defn with-content-created-timestamp
  "Sets content created timestamp.

  content-created-timestamp - Content created timestamp. - `java.util.Date`

  returns: This object for method chaining. - `com.amazonaws.services.workdocs.UploadDocumentStreamRequest`"
  (^com.amazonaws.services.workdocs.UploadDocumentStreamRequest [^UploadDocumentStreamRequest this ^java.util.Date content-created-timestamp]
    (-> this (.withContentCreatedTimestamp content-created-timestamp))))

(defn get-document-id
  "Gets document ID.

  returns: Document ID. - `java.lang.String`"
  (^java.lang.String [^UploadDocumentStreamRequest this]
    (-> this (.getDocumentId))))

(defn get-document-name
  "Gets document name.

  returns: Document name. - `java.lang.String`"
  (^java.lang.String [^UploadDocumentStreamRequest this]
    (-> this (.getDocumentName))))

(defn set-document-id
  "Sets document ID.

  document-id - Document ID. - `java.lang.String`"
  ([^UploadDocumentStreamRequest this ^java.lang.String document-id]
    (-> this (.setDocumentId document-id))))

(defn set-content-type
  "Sets content type.

  content-type - Content type. - `java.lang.String`"
  ([^UploadDocumentStreamRequest this ^java.lang.String content-type]
    (-> this (.setContentType content-type))))

(defn get-content-modified-timestamp
  "Gets content modified timestamp.

  returns: Content modified timestamp. - `java.util.Date`"
  (^java.util.Date [^UploadDocumentStreamRequest this]
    (-> this (.getContentModifiedTimestamp))))

(defn with-stream
  "Sets input stream of document.

  stream - Input stream of document. - `java.io.InputStream`

  returns: This object for method chaining. - `com.amazonaws.services.workdocs.UploadDocumentStreamRequest`"
  (^com.amazonaws.services.workdocs.UploadDocumentStreamRequest [^UploadDocumentStreamRequest this ^java.io.InputStream stream]
    (-> this (.withStream stream))))

(defn with-document-size-in-bytes
  "Sets document size in bytes.

  document-size-in-bytes - Document size in bytes. - `java.lang.Long`

  returns: This object for method chaining. - `com.amazonaws.services.workdocs.UploadDocumentStreamRequest`"
  (^com.amazonaws.services.workdocs.UploadDocumentStreamRequest [^UploadDocumentStreamRequest this ^java.lang.Long document-size-in-bytes]
    (-> this (.withDocumentSizeInBytes document-size-in-bytes))))

(defn get-parent-folder-id
  "Gets parent folder ID.

  returns: Parent folder ID. - `java.lang.String`"
  (^java.lang.String [^UploadDocumentStreamRequest this]
    (-> this (.getParentFolderId))))

(defn set-document-size-in-bytes
  "Sets document size in bytes.

  document-size-in-bytes - Document size in bytes. - `java.lang.Long`"
  ([^UploadDocumentStreamRequest this ^java.lang.Long document-size-in-bytes]
    (-> this (.setDocumentSizeInBytes document-size-in-bytes))))

(defn set-content-modified-timestamp
  "Sets content modified timestamp.

  content-modified-timestamp - Content modified timestamp. - `java.util.Date`"
  ([^UploadDocumentStreamRequest this ^java.util.Date content-modified-timestamp]
    (-> this (.setContentModifiedTimestamp content-modified-timestamp))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^UploadDocumentStreamRequest this]
    (-> this (.toString))))

(defn get-content-type
  "Gets content type.

  returns: Content type. - `java.lang.String`"
  (^java.lang.String [^UploadDocumentStreamRequest this]
    (-> this (.getContentType))))

(defn get-content-created-timestamp
  "Gets content created timestamp.

  returns: Content created timestamp. - `java.util.Date`"
  (^java.util.Date [^UploadDocumentStreamRequest this]
    (-> this (.getContentCreatedTimestamp))))

(defn with-document-name
  "Sets document name.

  document-name - Document name. - `java.lang.String`

  returns: This object for method chaining. - `com.amazonaws.services.workdocs.UploadDocumentStreamRequest`"
  (^com.amazonaws.services.workdocs.UploadDocumentStreamRequest [^UploadDocumentStreamRequest this ^java.lang.String document-name]
    (-> this (.withDocumentName document-name))))

(defn with-content-modified-timestamp
  "Sets content modified timestamp.

  content-modified-timestamp - Content modified timestamp. - `java.util.Date`

  returns: This object for method chaining. - `com.amazonaws.services.workdocs.UploadDocumentStreamRequest`"
  (^com.amazonaws.services.workdocs.UploadDocumentStreamRequest [^UploadDocumentStreamRequest this ^java.util.Date content-modified-timestamp]
    (-> this (.withContentModifiedTimestamp content-modified-timestamp))))

(defn with-document-id
  "Sets document ID.

  document-id - Document ID. - `java.lang.String`

  returns: This object for method chaining. - `com.amazonaws.services.workdocs.UploadDocumentStreamRequest`"
  (^com.amazonaws.services.workdocs.UploadDocumentStreamRequest [^UploadDocumentStreamRequest this ^java.lang.String document-id]
    (-> this (.withDocumentId document-id))))

(defn with-parent-folder-id
  "Sets parent folder ID.

  parent-folder-id - Parent folder ID. - `java.lang.String`

  returns: This object for method chaining. - `com.amazonaws.services.workdocs.UploadDocumentStreamRequest`"
  (^com.amazonaws.services.workdocs.UploadDocumentStreamRequest [^UploadDocumentStreamRequest this ^java.lang.String parent-folder-id]
    (-> this (.withParentFolderId parent-folder-id))))

(defn get-stream
  "Gets input stream of document.

  returns: Input stream of document. - `java.io.InputStream`"
  (^java.io.InputStream [^UploadDocumentStreamRequest this]
    (-> this (.getStream))))

(defn with-content-type
  "Sets content type.

  content-type - Content type. - `java.lang.String`

  returns: This object for method chaining. - `com.amazonaws.services.workdocs.UploadDocumentStreamRequest`"
  (^com.amazonaws.services.workdocs.UploadDocumentStreamRequest [^UploadDocumentStreamRequest this ^java.lang.String content-type]
    (-> this (.withContentType content-type))))

(defn set-document-name
  "Sets document name.

  document-name - Document name. - `java.lang.String`"
  ([^UploadDocumentStreamRequest this ^java.lang.String document-name]
    (-> this (.setDocumentName document-name))))

(defn set-parent-folder-id
  "Sets parent folder ID.

  parent-folder-id - Parent folder ID. - `java.lang.String`"
  ([^UploadDocumentStreamRequest this ^java.lang.String parent-folder-id]
    (-> this (.setParentFolderId parent-folder-id))))

(defn set-stream
  "Sets input stream of document.

  stream - Input stream of document. - `java.io.InputStream`"
  ([^UploadDocumentStreamRequest this ^java.io.InputStream stream]
    (-> this (.setStream stream))))

(defn with-authentication-token
  "Sets authentication token.

  authentication-token - Authentication token. - `java.lang.String`

  returns: This object for method chaining. - `com.amazonaws.services.workdocs.UploadDocumentStreamRequest`"
  (^com.amazonaws.services.workdocs.UploadDocumentStreamRequest [^UploadDocumentStreamRequest this ^java.lang.String authentication-token]
    (-> this (.withAuthenticationToken authentication-token))))

(defn hash-code
  "returns: `int`"
  (^Integer [^UploadDocumentStreamRequest this]
    (-> this (.hashCode))))

(defn set-content-created-timestamp
  "Sets content created timestamp.

  content-created-timestamp - Content created timestamp. - `java.util.Date`"
  ([^UploadDocumentStreamRequest this ^java.util.Date content-created-timestamp]
    (-> this (.setContentCreatedTimestamp content-created-timestamp))))

(defn set-authentication-token
  "Sets authentication token.

  authentication-token - Authentication token. - `java.lang.String`"
  ([^UploadDocumentStreamRequest this ^java.lang.String authentication-token]
    (-> this (.setAuthenticationToken authentication-token))))

(defn get-authentication-token
  "Gets authentication token.

  returns: Authentication token. - `java.lang.String`"
  (^java.lang.String [^UploadDocumentStreamRequest this]
    (-> this (.getAuthenticationToken))))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^UploadDocumentStreamRequest this ^java.lang.Object obj]
    (-> this (.equals obj))))

(defn get-document-size-in-bytes
  "Gets document size in bytes.

  returns: Document size in bytes. - `java.lang.Long`"
  (^java.lang.Long [^UploadDocumentStreamRequest this]
    (-> this (.getDocumentSizeInBytes))))

