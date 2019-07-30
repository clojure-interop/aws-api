(ns com.amazonaws.services.workdocs.ContentManager
  "High level synchronous utility for transferring content from and to Amazon WorkDocs.
  ContentManager provides a simple API for uploading and downloading
  documents to/from Amazon WorkDocs easily.
  ContentManager, like all the client classes in the AWS SDK for Java, is thread safe.


  In order to use ContentManager:


  AWSStaticCredentialsProvider credentialsProvider = new AWSStaticCredentialsProvider(new AnonymousAWSCredentials());
  AmazonWorkDocs client = AmazonWorkDocsClient.builder().withCredentials(credentialsProvider).withRegion(Regions.REGION).build();
  ContentManager contentManager = ContentManagerBuilder.standard().withWorkDocsClient(client).withAuthenticationToken(authenticationToken).build();
  GetDocumentStreamRequest request = new GetDocumentStreamRequest();
  request.setDocumentId(\"doc-id\");
  InputStream inputStream = contentManager.getDocumentStream(request).getStream();"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.workdocs ContentManager]))

(defn get-document-stream
  "Gets document stream from WorkDocs.
   If VersionId of GetDocumentStreamRequest is not specified,
   then the latest version of specified document is retrieved.
   Clients must close the stream once content is read.

  get-document-stream-request - Request specifying parameters of the operation. - `com.amazonaws.services.workdocs.GetDocumentStreamRequest`

  returns: Result containing stream of requested document content. - `com.amazonaws.services.workdocs.GetDocumentStreamResult`"
  (^com.amazonaws.services.workdocs.GetDocumentStreamResult [^ContentManager this ^com.amazonaws.services.workdocs.GetDocumentStreamRequest get-document-stream-request]
    (-> this (.getDocumentStream get-document-stream-request))))

(defn upload-document-stream
  "Uploads document stream to WorkDocs.
   If document ID is specified, then it creates a new version under this document.
   If document ID is not specified, then it creates a new document and uploads content to its only version.\\
   Client must close the input stream once upload operation is complete.

  upload-document-stream-request - Request specifying parameters of the operation. - `com.amazonaws.services.workdocs.UploadDocumentStreamRequest`

  returns: Result containing metadata of the newly created document or version. - `com.amazonaws.services.workdocs.UploadDocumentStreamResult`"
  (^com.amazonaws.services.workdocs.UploadDocumentStreamResult [^ContentManager this ^com.amazonaws.services.workdocs.UploadDocumentStreamRequest upload-document-stream-request]
    (-> this (.uploadDocumentStream upload-document-stream-request))))

