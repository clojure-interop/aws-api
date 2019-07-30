(ns com.amazonaws.services.workdocs.GetDocumentStreamRequest
  "Request parameters for GetDocumentStream operation."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.workdocs GetDocumentStreamRequest]))

(defn ->get-document-stream-request
  "Constructor.

  Initializes GetDocumentStreamRequest object."
  (^GetDocumentStreamRequest []
    (new GetDocumentStreamRequest )))

(defn get-document-id
  "Gets document ID.

  returns: Document ID. - `java.lang.String`"
  (^java.lang.String [^GetDocumentStreamRequest this]
    (-> this (.getDocumentId))))

(defn set-document-id
  "Sets document ID.

  document-id - Document ID. - `java.lang.String`"
  ([^GetDocumentStreamRequest this ^java.lang.String document-id]
    (-> this (.setDocumentId document-id))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^GetDocumentStreamRequest this]
    (-> this (.toString))))

(defn with-document-id
  "Sets document ID.

  document-id - Document ID. - `java.lang.String`

  returns: This object for method chaining. - `com.amazonaws.services.workdocs.GetDocumentStreamRequest`"
  (^com.amazonaws.services.workdocs.GetDocumentStreamRequest [^GetDocumentStreamRequest this ^java.lang.String document-id]
    (-> this (.withDocumentId document-id))))

(defn with-authentication-token
  "Sets authentication token.

  authentication-token - Authentication token. - `java.lang.String`

  returns: This object for method chaining. - `com.amazonaws.services.workdocs.GetDocumentStreamRequest`"
  (^com.amazonaws.services.workdocs.GetDocumentStreamRequest [^GetDocumentStreamRequest this ^java.lang.String authentication-token]
    (-> this (.withAuthenticationToken authentication-token))))

(defn hash-code
  "returns: `int`"
  (^Integer [^GetDocumentStreamRequest this]
    (-> this (.hashCode))))

(defn set-version-id
  "Sets document version ID.

  version-id - Document version ID. - `java.lang.String`"
  ([^GetDocumentStreamRequest this ^java.lang.String version-id]
    (-> this (.setVersionId version-id))))

(defn set-authentication-token
  "Sets authentication token.

  authentication-token - Authentication token. - `java.lang.String`"
  ([^GetDocumentStreamRequest this ^java.lang.String authentication-token]
    (-> this (.setAuthenticationToken authentication-token))))

(defn get-authentication-token
  "Gets authentication token.

  returns: Authentication token. - `java.lang.String`"
  (^java.lang.String [^GetDocumentStreamRequest this]
    (-> this (.getAuthenticationToken))))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^GetDocumentStreamRequest this ^java.lang.Object obj]
    (-> this (.equals obj))))

(defn get-version-id
  "Gets document version ID.

  returns: Document version ID. - `java.lang.String`"
  (^java.lang.String [^GetDocumentStreamRequest this]
    (-> this (.getVersionId))))

(defn with-version-id
  "Sets document version ID.

  version-id - Document version ID. - `java.lang.String`

  returns: This object for method chaining. - `com.amazonaws.services.workdocs.GetDocumentStreamRequest`"
  (^com.amazonaws.services.workdocs.GetDocumentStreamRequest [^GetDocumentStreamRequest this ^java.lang.String version-id]
    (-> this (.withVersionId version-id))))

