(ns com.amazonaws.services.workdocs.ContentManagerAsync
  "High level asynchronous utility for transferring content from and to Amazon WorkDocs.
  ContentManagerAsync provides a simple API for uploading and downloading
  documents to/from Amazon WorkDocs easily.
  ContentManagerAsync, like all the client classes in the AWS SDK for Java, is thread safe.
  Call ContentManagerAsync.shutdownNow(true) to release the resources once the
  operation is complete. If you want to keep Amazon WorkDocs client open, then call ContentManagerAsync.shutdownNow(false).

  In order to use ContentManager:


  AWSStaticCredentialsProvider credentialsProvider = new AWSStaticCredentialsProvider(new AnonymousAWSCredentials());
  AmazonWorkDocs client = AmazonWorkDocsClient.builder().withCredentials(credentialsProvider).withRegion(Regions.REGION).build();
  ContentManagerAsync contentManager = ContentManagerAsyncBuilder.standard().withWorkDocsClient(client).withAuthenticationToken(authenticationToken).build();
  GetDocumentStreamRequest request = new GetDocumentStreamRequest();
  request.setDocumentId(\"doc-id\");
  InputStream inputStream = contentManager.getDocumentStreamAsync(request).get().getStream();
  contentManager.shutdownNow(true);"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.workdocs ContentManagerAsync]))

(defn get-document-stream-async
  "Asynchronously gets document stream of latest version of given document and version ID.
   If version ID is null, it retrieves latest version of requested document ID.
   Clients must close the stream once content is read.

  get-document-stream-request - Request specifying parameters of the operation. - `com.amazonaws.services.workdocs.GetDocumentStreamRequest`

  returns: Result containing stream of requested document content. - `java.util.concurrent.Future<com.amazonaws.services.workdocs.GetDocumentStreamResult>`"
  (^java.util.concurrent.Future [^ContentManagerAsync this ^com.amazonaws.services.workdocs.GetDocumentStreamRequest get-document-stream-request]
    (-> this (.getDocumentStreamAsync get-document-stream-request))))

(defn upload-document-stream-async
  "Asynchronously uploads stream to given folder and document name.
   Client must close the input stream once upload operation is complete.

  upload-document-stream-request - Request specifying parameters of the operation. - `com.amazonaws.services.workdocs.UploadDocumentStreamRequest`

  returns: Result containing metadata of the newly created document or version. - `java.util.concurrent.Future<com.amazonaws.services.workdocs.UploadDocumentStreamResult>`

  throws: java.lang.IllegalArgumentException"
  (^java.util.concurrent.Future [^ContentManagerAsync this ^com.amazonaws.services.workdocs.UploadDocumentStreamRequest upload-document-stream-request]
    (-> this (.uploadDocumentStreamAsync upload-document-stream-request))))

(defn shutdown-now
  "Forcefully shuts down this ContentManager instance - currently executing
   operations will not be allowed to finish. Callers should use this method
   when they either:

   have already verified that their operations have completed by checking
   each transfer's state
   need to exit quickly and don't mind stopping operations before they
   complete.


   Callers should also remember that uploaded parts from an interrupted
   upload may not always be automatically cleaned up.

  shutdown-work-docs-client - Whether to shut down the underlying Amazon WorkDocs client. - `boolean`"
  ([^ContentManagerAsync this ^Boolean shutdown-work-docs-client]
    (-> this (.shutdownNow shutdown-work-docs-client))))

