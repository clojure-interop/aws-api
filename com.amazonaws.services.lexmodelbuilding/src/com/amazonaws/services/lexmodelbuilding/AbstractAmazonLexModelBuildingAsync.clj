(ns com.amazonaws.services.lexmodelbuilding.AbstractAmazonLexModelBuildingAsync
  "Abstract implementation of AmazonLexModelBuildingAsync. Convenient method forms pass through to the
  corresponding overload that takes a request object and an AsyncHandler, which throws an
  UnsupportedOperationException."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.lexmodelbuilding AbstractAmazonLexModelBuildingAsync]))

(defn get-bot-channel-associations-async
  "Description copied from interface: AmazonLexModelBuildingAsync

  request - `com.amazonaws.services.lexmodelbuilding.model.GetBotChannelAssociationsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetBotChannelAssociations operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.lexmodelbuilding.model.GetBotChannelAssociationsResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonLexModelBuildingAsync this ^com.amazonaws.services.lexmodelbuilding.model.GetBotChannelAssociationsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getBotChannelAssociationsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonLexModelBuildingAsync this ^com.amazonaws.services.lexmodelbuilding.model.GetBotChannelAssociationsRequest request]
    (-> this (.getBotChannelAssociationsAsync request))))

(defn get-intents-async
  "Description copied from interface: AmazonLexModelBuildingAsync

  request - `com.amazonaws.services.lexmodelbuilding.model.GetIntentsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetIntents operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.lexmodelbuilding.model.GetIntentsResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonLexModelBuildingAsync this ^com.amazonaws.services.lexmodelbuilding.model.GetIntentsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getIntentsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonLexModelBuildingAsync this ^com.amazonaws.services.lexmodelbuilding.model.GetIntentsRequest request]
    (-> this (.getIntentsAsync request))))

(defn get-export-async
  "Description copied from interface: AmazonLexModelBuildingAsync

  request - `com.amazonaws.services.lexmodelbuilding.model.GetExportRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetExport operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.lexmodelbuilding.model.GetExportResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonLexModelBuildingAsync this ^com.amazonaws.services.lexmodelbuilding.model.GetExportRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getExportAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonLexModelBuildingAsync this ^com.amazonaws.services.lexmodelbuilding.model.GetExportRequest request]
    (-> this (.getExportAsync request))))

(defn put-bot-alias-async
  "Description copied from interface: AmazonLexModelBuildingAsync

  request - `com.amazonaws.services.lexmodelbuilding.model.PutBotAliasRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PutBotAlias operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.lexmodelbuilding.model.PutBotAliasResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonLexModelBuildingAsync this ^com.amazonaws.services.lexmodelbuilding.model.PutBotAliasRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.putBotAliasAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonLexModelBuildingAsync this ^com.amazonaws.services.lexmodelbuilding.model.PutBotAliasRequest request]
    (-> this (.putBotAliasAsync request))))

(defn get-slot-types-async
  "Description copied from interface: AmazonLexModelBuildingAsync

  request - `com.amazonaws.services.lexmodelbuilding.model.GetSlotTypesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetSlotTypes operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.lexmodelbuilding.model.GetSlotTypesResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonLexModelBuildingAsync this ^com.amazonaws.services.lexmodelbuilding.model.GetSlotTypesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getSlotTypesAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonLexModelBuildingAsync this ^com.amazonaws.services.lexmodelbuilding.model.GetSlotTypesRequest request]
    (-> this (.getSlotTypesAsync request))))

(defn create-bot-version-async
  "Description copied from interface: AmazonLexModelBuildingAsync

  request - `com.amazonaws.services.lexmodelbuilding.model.CreateBotVersionRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateBotVersion operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.lexmodelbuilding.model.CreateBotVersionResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonLexModelBuildingAsync this ^com.amazonaws.services.lexmodelbuilding.model.CreateBotVersionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createBotVersionAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonLexModelBuildingAsync this ^com.amazonaws.services.lexmodelbuilding.model.CreateBotVersionRequest request]
    (-> this (.createBotVersionAsync request))))

(defn delete-bot-channel-association-async
  "Description copied from interface: AmazonLexModelBuildingAsync

  request - `com.amazonaws.services.lexmodelbuilding.model.DeleteBotChannelAssociationRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteBotChannelAssociation operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.lexmodelbuilding.model.DeleteBotChannelAssociationResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonLexModelBuildingAsync this ^com.amazonaws.services.lexmodelbuilding.model.DeleteBotChannelAssociationRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteBotChannelAssociationAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonLexModelBuildingAsync this ^com.amazonaws.services.lexmodelbuilding.model.DeleteBotChannelAssociationRequest request]
    (-> this (.deleteBotChannelAssociationAsync request))))

(defn get-bot-versions-async
  "Description copied from interface: AmazonLexModelBuildingAsync

  request - `com.amazonaws.services.lexmodelbuilding.model.GetBotVersionsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetBotVersions operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.lexmodelbuilding.model.GetBotVersionsResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonLexModelBuildingAsync this ^com.amazonaws.services.lexmodelbuilding.model.GetBotVersionsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getBotVersionsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonLexModelBuildingAsync this ^com.amazonaws.services.lexmodelbuilding.model.GetBotVersionsRequest request]
    (-> this (.getBotVersionsAsync request))))

(defn get-intent-versions-async
  "Description copied from interface: AmazonLexModelBuildingAsync

  request - `com.amazonaws.services.lexmodelbuilding.model.GetIntentVersionsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetIntentVersions operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.lexmodelbuilding.model.GetIntentVersionsResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonLexModelBuildingAsync this ^com.amazonaws.services.lexmodelbuilding.model.GetIntentVersionsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getIntentVersionsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonLexModelBuildingAsync this ^com.amazonaws.services.lexmodelbuilding.model.GetIntentVersionsRequest request]
    (-> this (.getIntentVersionsAsync request))))

(defn get-builtin-slot-types-async
  "Description copied from interface: AmazonLexModelBuildingAsync

  request - `com.amazonaws.services.lexmodelbuilding.model.GetBuiltinSlotTypesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetBuiltinSlotTypes operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.lexmodelbuilding.model.GetBuiltinSlotTypesResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonLexModelBuildingAsync this ^com.amazonaws.services.lexmodelbuilding.model.GetBuiltinSlotTypesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getBuiltinSlotTypesAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonLexModelBuildingAsync this ^com.amazonaws.services.lexmodelbuilding.model.GetBuiltinSlotTypesRequest request]
    (-> this (.getBuiltinSlotTypesAsync request))))

(defn delete-bot-async
  "Description copied from interface: AmazonLexModelBuildingAsync

  request - `com.amazonaws.services.lexmodelbuilding.model.DeleteBotRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteBot operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.lexmodelbuilding.model.DeleteBotResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonLexModelBuildingAsync this ^com.amazonaws.services.lexmodelbuilding.model.DeleteBotRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteBotAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonLexModelBuildingAsync this ^com.amazonaws.services.lexmodelbuilding.model.DeleteBotRequest request]
    (-> this (.deleteBotAsync request))))

(defn put-intent-async
  "Description copied from interface: AmazonLexModelBuildingAsync

  request - `com.amazonaws.services.lexmodelbuilding.model.PutIntentRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PutIntent operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.lexmodelbuilding.model.PutIntentResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonLexModelBuildingAsync this ^com.amazonaws.services.lexmodelbuilding.model.PutIntentRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.putIntentAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonLexModelBuildingAsync this ^com.amazonaws.services.lexmodelbuilding.model.PutIntentRequest request]
    (-> this (.putIntentAsync request))))

(defn delete-bot-alias-async
  "Description copied from interface: AmazonLexModelBuildingAsync

  request - `com.amazonaws.services.lexmodelbuilding.model.DeleteBotAliasRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteBotAlias operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.lexmodelbuilding.model.DeleteBotAliasResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonLexModelBuildingAsync this ^com.amazonaws.services.lexmodelbuilding.model.DeleteBotAliasRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteBotAliasAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonLexModelBuildingAsync this ^com.amazonaws.services.lexmodelbuilding.model.DeleteBotAliasRequest request]
    (-> this (.deleteBotAliasAsync request))))

(defn delete-intent-async
  "Description copied from interface: AmazonLexModelBuildingAsync

  request - `com.amazonaws.services.lexmodelbuilding.model.DeleteIntentRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteIntent operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.lexmodelbuilding.model.DeleteIntentResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonLexModelBuildingAsync this ^com.amazonaws.services.lexmodelbuilding.model.DeleteIntentRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteIntentAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonLexModelBuildingAsync this ^com.amazonaws.services.lexmodelbuilding.model.DeleteIntentRequest request]
    (-> this (.deleteIntentAsync request))))

(defn put-bot-async
  "Description copied from interface: AmazonLexModelBuildingAsync

  request - `com.amazonaws.services.lexmodelbuilding.model.PutBotRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PutBot operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.lexmodelbuilding.model.PutBotResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonLexModelBuildingAsync this ^com.amazonaws.services.lexmodelbuilding.model.PutBotRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.putBotAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonLexModelBuildingAsync this ^com.amazonaws.services.lexmodelbuilding.model.PutBotRequest request]
    (-> this (.putBotAsync request))))

(defn get-intent-async
  "Description copied from interface: AmazonLexModelBuildingAsync

  request - `com.amazonaws.services.lexmodelbuilding.model.GetIntentRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetIntent operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.lexmodelbuilding.model.GetIntentResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonLexModelBuildingAsync this ^com.amazonaws.services.lexmodelbuilding.model.GetIntentRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getIntentAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonLexModelBuildingAsync this ^com.amazonaws.services.lexmodelbuilding.model.GetIntentRequest request]
    (-> this (.getIntentAsync request))))

(defn get-bots-async
  "Description copied from interface: AmazonLexModelBuildingAsync

  request - `com.amazonaws.services.lexmodelbuilding.model.GetBotsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetBots operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.lexmodelbuilding.model.GetBotsResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonLexModelBuildingAsync this ^com.amazonaws.services.lexmodelbuilding.model.GetBotsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getBotsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonLexModelBuildingAsync this ^com.amazonaws.services.lexmodelbuilding.model.GetBotsRequest request]
    (-> this (.getBotsAsync request))))

(defn get-import-async
  "Description copied from interface: AmazonLexModelBuildingAsync

  request - `com.amazonaws.services.lexmodelbuilding.model.GetImportRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetImport operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.lexmodelbuilding.model.GetImportResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonLexModelBuildingAsync this ^com.amazonaws.services.lexmodelbuilding.model.GetImportRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getImportAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonLexModelBuildingAsync this ^com.amazonaws.services.lexmodelbuilding.model.GetImportRequest request]
    (-> this (.getImportAsync request))))

(defn delete-intent-version-async
  "Description copied from interface: AmazonLexModelBuildingAsync

  request - `com.amazonaws.services.lexmodelbuilding.model.DeleteIntentVersionRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteIntentVersion operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.lexmodelbuilding.model.DeleteIntentVersionResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonLexModelBuildingAsync this ^com.amazonaws.services.lexmodelbuilding.model.DeleteIntentVersionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteIntentVersionAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonLexModelBuildingAsync this ^com.amazonaws.services.lexmodelbuilding.model.DeleteIntentVersionRequest request]
    (-> this (.deleteIntentVersionAsync request))))

(defn get-bot-aliases-async
  "Description copied from interface: AmazonLexModelBuildingAsync

  request - `com.amazonaws.services.lexmodelbuilding.model.GetBotAliasesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetBotAliases operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.lexmodelbuilding.model.GetBotAliasesResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonLexModelBuildingAsync this ^com.amazonaws.services.lexmodelbuilding.model.GetBotAliasesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getBotAliasesAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonLexModelBuildingAsync this ^com.amazonaws.services.lexmodelbuilding.model.GetBotAliasesRequest request]
    (-> this (.getBotAliasesAsync request))))

(defn get-slot-type-versions-async
  "Description copied from interface: AmazonLexModelBuildingAsync

  request - `com.amazonaws.services.lexmodelbuilding.model.GetSlotTypeVersionsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetSlotTypeVersions operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.lexmodelbuilding.model.GetSlotTypeVersionsResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonLexModelBuildingAsync this ^com.amazonaws.services.lexmodelbuilding.model.GetSlotTypeVersionsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getSlotTypeVersionsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonLexModelBuildingAsync this ^com.amazonaws.services.lexmodelbuilding.model.GetSlotTypeVersionsRequest request]
    (-> this (.getSlotTypeVersionsAsync request))))

(defn get-utterances-view-async
  "Description copied from interface: AmazonLexModelBuildingAsync

  request - `com.amazonaws.services.lexmodelbuilding.model.GetUtterancesViewRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetUtterancesView operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.lexmodelbuilding.model.GetUtterancesViewResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonLexModelBuildingAsync this ^com.amazonaws.services.lexmodelbuilding.model.GetUtterancesViewRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getUtterancesViewAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonLexModelBuildingAsync this ^com.amazonaws.services.lexmodelbuilding.model.GetUtterancesViewRequest request]
    (-> this (.getUtterancesViewAsync request))))

(defn put-slot-type-async
  "Description copied from interface: AmazonLexModelBuildingAsync

  request - `com.amazonaws.services.lexmodelbuilding.model.PutSlotTypeRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PutSlotType operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.lexmodelbuilding.model.PutSlotTypeResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonLexModelBuildingAsync this ^com.amazonaws.services.lexmodelbuilding.model.PutSlotTypeRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.putSlotTypeAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonLexModelBuildingAsync this ^com.amazonaws.services.lexmodelbuilding.model.PutSlotTypeRequest request]
    (-> this (.putSlotTypeAsync request))))

(defn get-bot-async
  "Description copied from interface: AmazonLexModelBuildingAsync

  request - `com.amazonaws.services.lexmodelbuilding.model.GetBotRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetBot operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.lexmodelbuilding.model.GetBotResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonLexModelBuildingAsync this ^com.amazonaws.services.lexmodelbuilding.model.GetBotRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getBotAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonLexModelBuildingAsync this ^com.amazonaws.services.lexmodelbuilding.model.GetBotRequest request]
    (-> this (.getBotAsync request))))

(defn start-import-async
  "Description copied from interface: AmazonLexModelBuildingAsync

  request - `com.amazonaws.services.lexmodelbuilding.model.StartImportRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the StartImport operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.lexmodelbuilding.model.StartImportResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonLexModelBuildingAsync this ^com.amazonaws.services.lexmodelbuilding.model.StartImportRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.startImportAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonLexModelBuildingAsync this ^com.amazonaws.services.lexmodelbuilding.model.StartImportRequest request]
    (-> this (.startImportAsync request))))

(defn get-slot-type-async
  "Description copied from interface: AmazonLexModelBuildingAsync

  request - `com.amazonaws.services.lexmodelbuilding.model.GetSlotTypeRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetSlotType operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.lexmodelbuilding.model.GetSlotTypeResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonLexModelBuildingAsync this ^com.amazonaws.services.lexmodelbuilding.model.GetSlotTypeRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getSlotTypeAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonLexModelBuildingAsync this ^com.amazonaws.services.lexmodelbuilding.model.GetSlotTypeRequest request]
    (-> this (.getSlotTypeAsync request))))

(defn delete-bot-version-async
  "Description copied from interface: AmazonLexModelBuildingAsync

  request - `com.amazonaws.services.lexmodelbuilding.model.DeleteBotVersionRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteBotVersion operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.lexmodelbuilding.model.DeleteBotVersionResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonLexModelBuildingAsync this ^com.amazonaws.services.lexmodelbuilding.model.DeleteBotVersionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteBotVersionAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonLexModelBuildingAsync this ^com.amazonaws.services.lexmodelbuilding.model.DeleteBotVersionRequest request]
    (-> this (.deleteBotVersionAsync request))))

(defn delete-slot-type-async
  "Description copied from interface: AmazonLexModelBuildingAsync

  request - `com.amazonaws.services.lexmodelbuilding.model.DeleteSlotTypeRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteSlotType operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.lexmodelbuilding.model.DeleteSlotTypeResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonLexModelBuildingAsync this ^com.amazonaws.services.lexmodelbuilding.model.DeleteSlotTypeRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteSlotTypeAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonLexModelBuildingAsync this ^com.amazonaws.services.lexmodelbuilding.model.DeleteSlotTypeRequest request]
    (-> this (.deleteSlotTypeAsync request))))

(defn create-intent-version-async
  "Description copied from interface: AmazonLexModelBuildingAsync

  request - `com.amazonaws.services.lexmodelbuilding.model.CreateIntentVersionRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateIntentVersion operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.lexmodelbuilding.model.CreateIntentVersionResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonLexModelBuildingAsync this ^com.amazonaws.services.lexmodelbuilding.model.CreateIntentVersionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createIntentVersionAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonLexModelBuildingAsync this ^com.amazonaws.services.lexmodelbuilding.model.CreateIntentVersionRequest request]
    (-> this (.createIntentVersionAsync request))))

(defn get-builtin-intent-async
  "Description copied from interface: AmazonLexModelBuildingAsync

  request - `com.amazonaws.services.lexmodelbuilding.model.GetBuiltinIntentRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetBuiltinIntent operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.lexmodelbuilding.model.GetBuiltinIntentResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonLexModelBuildingAsync this ^com.amazonaws.services.lexmodelbuilding.model.GetBuiltinIntentRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getBuiltinIntentAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonLexModelBuildingAsync this ^com.amazonaws.services.lexmodelbuilding.model.GetBuiltinIntentRequest request]
    (-> this (.getBuiltinIntentAsync request))))

(defn create-slot-type-version-async
  "Description copied from interface: AmazonLexModelBuildingAsync

  request - `com.amazonaws.services.lexmodelbuilding.model.CreateSlotTypeVersionRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateSlotTypeVersion operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.lexmodelbuilding.model.CreateSlotTypeVersionResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonLexModelBuildingAsync this ^com.amazonaws.services.lexmodelbuilding.model.CreateSlotTypeVersionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createSlotTypeVersionAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonLexModelBuildingAsync this ^com.amazonaws.services.lexmodelbuilding.model.CreateSlotTypeVersionRequest request]
    (-> this (.createSlotTypeVersionAsync request))))

(defn delete-utterances-async
  "Description copied from interface: AmazonLexModelBuildingAsync

  request - `com.amazonaws.services.lexmodelbuilding.model.DeleteUtterancesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteUtterances operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.lexmodelbuilding.model.DeleteUtterancesResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonLexModelBuildingAsync this ^com.amazonaws.services.lexmodelbuilding.model.DeleteUtterancesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteUtterancesAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonLexModelBuildingAsync this ^com.amazonaws.services.lexmodelbuilding.model.DeleteUtterancesRequest request]
    (-> this (.deleteUtterancesAsync request))))

(defn delete-slot-type-version-async
  "Description copied from interface: AmazonLexModelBuildingAsync

  request - `com.amazonaws.services.lexmodelbuilding.model.DeleteSlotTypeVersionRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteSlotTypeVersion operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.lexmodelbuilding.model.DeleteSlotTypeVersionResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonLexModelBuildingAsync this ^com.amazonaws.services.lexmodelbuilding.model.DeleteSlotTypeVersionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteSlotTypeVersionAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonLexModelBuildingAsync this ^com.amazonaws.services.lexmodelbuilding.model.DeleteSlotTypeVersionRequest request]
    (-> this (.deleteSlotTypeVersionAsync request))))

(defn get-bot-channel-association-async
  "Description copied from interface: AmazonLexModelBuildingAsync

  request - `com.amazonaws.services.lexmodelbuilding.model.GetBotChannelAssociationRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetBotChannelAssociation operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.lexmodelbuilding.model.GetBotChannelAssociationResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonLexModelBuildingAsync this ^com.amazonaws.services.lexmodelbuilding.model.GetBotChannelAssociationRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getBotChannelAssociationAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonLexModelBuildingAsync this ^com.amazonaws.services.lexmodelbuilding.model.GetBotChannelAssociationRequest request]
    (-> this (.getBotChannelAssociationAsync request))))

(defn get-builtin-intents-async
  "Description copied from interface: AmazonLexModelBuildingAsync

  request - `com.amazonaws.services.lexmodelbuilding.model.GetBuiltinIntentsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetBuiltinIntents operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.lexmodelbuilding.model.GetBuiltinIntentsResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonLexModelBuildingAsync this ^com.amazonaws.services.lexmodelbuilding.model.GetBuiltinIntentsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getBuiltinIntentsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonLexModelBuildingAsync this ^com.amazonaws.services.lexmodelbuilding.model.GetBuiltinIntentsRequest request]
    (-> this (.getBuiltinIntentsAsync request))))

(defn get-bot-alias-async
  "Description copied from interface: AmazonLexModelBuildingAsync

  request - `com.amazonaws.services.lexmodelbuilding.model.GetBotAliasRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetBotAlias operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.lexmodelbuilding.model.GetBotAliasResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonLexModelBuildingAsync this ^com.amazonaws.services.lexmodelbuilding.model.GetBotAliasRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getBotAliasAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonLexModelBuildingAsync this ^com.amazonaws.services.lexmodelbuilding.model.GetBotAliasRequest request]
    (-> this (.getBotAliasAsync request))))

