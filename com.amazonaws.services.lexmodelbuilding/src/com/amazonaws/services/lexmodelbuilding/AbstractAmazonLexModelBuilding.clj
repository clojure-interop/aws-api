(ns com.amazonaws.services.lexmodelbuilding.AbstractAmazonLexModelBuilding
  "Abstract implementation of AmazonLexModelBuilding. Convenient method forms pass through to the corresponding
  overload that takes a request object, which throws an UnsupportedOperationException."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.lexmodelbuilding AbstractAmazonLexModelBuilding]))

(defn delete-slot-type
  "Description copied from interface: AmazonLexModelBuilding

  request - `com.amazonaws.services.lexmodelbuilding.model.DeleteSlotTypeRequest`

  returns: Result of the DeleteSlotType operation returned by the service. - `com.amazonaws.services.lexmodelbuilding.model.DeleteSlotTypeResult`"
  (^com.amazonaws.services.lexmodelbuilding.model.DeleteSlotTypeResult [^AbstractAmazonLexModelBuilding this ^com.amazonaws.services.lexmodelbuilding.model.DeleteSlotTypeRequest request]
    (-> this (.deleteSlotType request))))

(defn start-import
  "Description copied from interface: AmazonLexModelBuilding

  request - `com.amazonaws.services.lexmodelbuilding.model.StartImportRequest`

  returns: Result of the StartImport operation returned by the service. - `com.amazonaws.services.lexmodelbuilding.model.StartImportResult`"
  (^com.amazonaws.services.lexmodelbuilding.model.StartImportResult [^AbstractAmazonLexModelBuilding this ^com.amazonaws.services.lexmodelbuilding.model.StartImportRequest request]
    (-> this (.startImport request))))

(defn get-builtin-intent
  "Description copied from interface: AmazonLexModelBuilding

  request - `com.amazonaws.services.lexmodelbuilding.model.GetBuiltinIntentRequest`

  returns: Result of the GetBuiltinIntent operation returned by the service. - `com.amazonaws.services.lexmodelbuilding.model.GetBuiltinIntentResult`"
  (^com.amazonaws.services.lexmodelbuilding.model.GetBuiltinIntentResult [^AbstractAmazonLexModelBuilding this ^com.amazonaws.services.lexmodelbuilding.model.GetBuiltinIntentRequest request]
    (-> this (.getBuiltinIntent request))))

(defn get-bot-alias
  "Description copied from interface: AmazonLexModelBuilding

  request - `com.amazonaws.services.lexmodelbuilding.model.GetBotAliasRequest`

  returns: Result of the GetBotAlias operation returned by the service. - `com.amazonaws.services.lexmodelbuilding.model.GetBotAliasResult`"
  (^com.amazonaws.services.lexmodelbuilding.model.GetBotAliasResult [^AbstractAmazonLexModelBuilding this ^com.amazonaws.services.lexmodelbuilding.model.GetBotAliasRequest request]
    (-> this (.getBotAlias request))))

(defn get-slot-type
  "Description copied from interface: AmazonLexModelBuilding

  request - `com.amazonaws.services.lexmodelbuilding.model.GetSlotTypeRequest`

  returns: Result of the GetSlotType operation returned by the service. - `com.amazonaws.services.lexmodelbuilding.model.GetSlotTypeResult`"
  (^com.amazonaws.services.lexmodelbuilding.model.GetSlotTypeResult [^AbstractAmazonLexModelBuilding this ^com.amazonaws.services.lexmodelbuilding.model.GetSlotTypeRequest request]
    (-> this (.getSlotType request))))

(defn get-utterances-view
  "Description copied from interface: AmazonLexModelBuilding

  request - `com.amazonaws.services.lexmodelbuilding.model.GetUtterancesViewRequest`

  returns: Result of the GetUtterancesView operation returned by the service. - `com.amazonaws.services.lexmodelbuilding.model.GetUtterancesViewResult`"
  (^com.amazonaws.services.lexmodelbuilding.model.GetUtterancesViewResult [^AbstractAmazonLexModelBuilding this ^com.amazonaws.services.lexmodelbuilding.model.GetUtterancesViewRequest request]
    (-> this (.getUtterancesView request))))

(defn put-bot
  "Description copied from interface: AmazonLexModelBuilding

  request - `com.amazonaws.services.lexmodelbuilding.model.PutBotRequest`

  returns: Result of the PutBot operation returned by the service. - `com.amazonaws.services.lexmodelbuilding.model.PutBotResult`"
  (^com.amazonaws.services.lexmodelbuilding.model.PutBotResult [^AbstractAmazonLexModelBuilding this ^com.amazonaws.services.lexmodelbuilding.model.PutBotRequest request]
    (-> this (.putBot request))))

(defn get-bot
  "Description copied from interface: AmazonLexModelBuilding

  request - `com.amazonaws.services.lexmodelbuilding.model.GetBotRequest`

  returns: Result of the GetBot operation returned by the service. - `com.amazonaws.services.lexmodelbuilding.model.GetBotResult`"
  (^com.amazonaws.services.lexmodelbuilding.model.GetBotResult [^AbstractAmazonLexModelBuilding this ^com.amazonaws.services.lexmodelbuilding.model.GetBotRequest request]
    (-> this (.getBot request))))

(defn get-builtin-slot-types
  "Description copied from interface: AmazonLexModelBuilding

  request - `com.amazonaws.services.lexmodelbuilding.model.GetBuiltinSlotTypesRequest`

  returns: Result of the GetBuiltinSlotTypes operation returned by the service. - `com.amazonaws.services.lexmodelbuilding.model.GetBuiltinSlotTypesResult`"
  (^com.amazonaws.services.lexmodelbuilding.model.GetBuiltinSlotTypesResult [^AbstractAmazonLexModelBuilding this ^com.amazonaws.services.lexmodelbuilding.model.GetBuiltinSlotTypesRequest request]
    (-> this (.getBuiltinSlotTypes request))))

(defn create-bot-version
  "Description copied from interface: AmazonLexModelBuilding

  request - `com.amazonaws.services.lexmodelbuilding.model.CreateBotVersionRequest`

  returns: Result of the CreateBotVersion operation returned by the service. - `com.amazonaws.services.lexmodelbuilding.model.CreateBotVersionResult`"
  (^com.amazonaws.services.lexmodelbuilding.model.CreateBotVersionResult [^AbstractAmazonLexModelBuilding this ^com.amazonaws.services.lexmodelbuilding.model.CreateBotVersionRequest request]
    (-> this (.createBotVersion request))))

(defn get-bot-versions
  "Description copied from interface: AmazonLexModelBuilding

  request - `com.amazonaws.services.lexmodelbuilding.model.GetBotVersionsRequest`

  returns: Result of the GetBotVersions operation returned by the service. - `com.amazonaws.services.lexmodelbuilding.model.GetBotVersionsResult`"
  (^com.amazonaws.services.lexmodelbuilding.model.GetBotVersionsResult [^AbstractAmazonLexModelBuilding this ^com.amazonaws.services.lexmodelbuilding.model.GetBotVersionsRequest request]
    (-> this (.getBotVersions request))))

(defn get-export
  "Description copied from interface: AmazonLexModelBuilding

  request - `com.amazonaws.services.lexmodelbuilding.model.GetExportRequest`

  returns: Result of the GetExport operation returned by the service. - `com.amazonaws.services.lexmodelbuilding.model.GetExportResult`"
  (^com.amazonaws.services.lexmodelbuilding.model.GetExportResult [^AbstractAmazonLexModelBuilding this ^com.amazonaws.services.lexmodelbuilding.model.GetExportRequest request]
    (-> this (.getExport request))))

(defn delete-intent-version
  "Description copied from interface: AmazonLexModelBuilding

  request - `com.amazonaws.services.lexmodelbuilding.model.DeleteIntentVersionRequest`

  returns: Result of the DeleteIntentVersion operation returned by the service. - `com.amazonaws.services.lexmodelbuilding.model.DeleteIntentVersionResult`"
  (^com.amazonaws.services.lexmodelbuilding.model.DeleteIntentVersionResult [^AbstractAmazonLexModelBuilding this ^com.amazonaws.services.lexmodelbuilding.model.DeleteIntentVersionRequest request]
    (-> this (.deleteIntentVersion request))))

(defn get-bot-channel-associations
  "Description copied from interface: AmazonLexModelBuilding

  request - `com.amazonaws.services.lexmodelbuilding.model.GetBotChannelAssociationsRequest`

  returns: Result of the GetBotChannelAssociations operation returned by the service. - `com.amazonaws.services.lexmodelbuilding.model.GetBotChannelAssociationsResult`"
  (^com.amazonaws.services.lexmodelbuilding.model.GetBotChannelAssociationsResult [^AbstractAmazonLexModelBuilding this ^com.amazonaws.services.lexmodelbuilding.model.GetBotChannelAssociationsRequest request]
    (-> this (.getBotChannelAssociations request))))

(defn get-slot-types
  "Description copied from interface: AmazonLexModelBuilding

  request - `com.amazonaws.services.lexmodelbuilding.model.GetSlotTypesRequest`

  returns: Result of the GetSlotTypes operation returned by the service. - `com.amazonaws.services.lexmodelbuilding.model.GetSlotTypesResult`"
  (^com.amazonaws.services.lexmodelbuilding.model.GetSlotTypesResult [^AbstractAmazonLexModelBuilding this ^com.amazonaws.services.lexmodelbuilding.model.GetSlotTypesRequest request]
    (-> this (.getSlotTypes request))))

(defn get-intent
  "Description copied from interface: AmazonLexModelBuilding

  request - `com.amazonaws.services.lexmodelbuilding.model.GetIntentRequest`

  returns: Result of the GetIntent operation returned by the service. - `com.amazonaws.services.lexmodelbuilding.model.GetIntentResult`"
  (^com.amazonaws.services.lexmodelbuilding.model.GetIntentResult [^AbstractAmazonLexModelBuilding this ^com.amazonaws.services.lexmodelbuilding.model.GetIntentRequest request]
    (-> this (.getIntent request))))

(defn shutdown
  "Description copied from interface: AmazonLexModelBuilding"
  ([^AbstractAmazonLexModelBuilding this]
    (-> this (.shutdown))))

(defn create-intent-version
  "Description copied from interface: AmazonLexModelBuilding

  request - `com.amazonaws.services.lexmodelbuilding.model.CreateIntentVersionRequest`

  returns: Result of the CreateIntentVersion operation returned by the service. - `com.amazonaws.services.lexmodelbuilding.model.CreateIntentVersionResult`"
  (^com.amazonaws.services.lexmodelbuilding.model.CreateIntentVersionResult [^AbstractAmazonLexModelBuilding this ^com.amazonaws.services.lexmodelbuilding.model.CreateIntentVersionRequest request]
    (-> this (.createIntentVersion request))))

(defn get-intents
  "Description copied from interface: AmazonLexModelBuilding

  request - `com.amazonaws.services.lexmodelbuilding.model.GetIntentsRequest`

  returns: Result of the GetIntents operation returned by the service. - `com.amazonaws.services.lexmodelbuilding.model.GetIntentsResult`"
  (^com.amazonaws.services.lexmodelbuilding.model.GetIntentsResult [^AbstractAmazonLexModelBuilding this ^com.amazonaws.services.lexmodelbuilding.model.GetIntentsRequest request]
    (-> this (.getIntents request))))

(defn put-slot-type
  "Description copied from interface: AmazonLexModelBuilding

  request - `com.amazonaws.services.lexmodelbuilding.model.PutSlotTypeRequest`

  returns: Result of the PutSlotType operation returned by the service. - `com.amazonaws.services.lexmodelbuilding.model.PutSlotTypeResult`"
  (^com.amazonaws.services.lexmodelbuilding.model.PutSlotTypeResult [^AbstractAmazonLexModelBuilding this ^com.amazonaws.services.lexmodelbuilding.model.PutSlotTypeRequest request]
    (-> this (.putSlotType request))))

(defn get-bot-aliases
  "Description copied from interface: AmazonLexModelBuilding

  request - `com.amazonaws.services.lexmodelbuilding.model.GetBotAliasesRequest`

  returns: Result of the GetBotAliases operation returned by the service. - `com.amazonaws.services.lexmodelbuilding.model.GetBotAliasesResult`"
  (^com.amazonaws.services.lexmodelbuilding.model.GetBotAliasesResult [^AbstractAmazonLexModelBuilding this ^com.amazonaws.services.lexmodelbuilding.model.GetBotAliasesRequest request]
    (-> this (.getBotAliases request))))

(defn get-bots
  "Description copied from interface: AmazonLexModelBuilding

  request - `com.amazonaws.services.lexmodelbuilding.model.GetBotsRequest`

  returns: Result of the GetBots operation returned by the service. - `com.amazonaws.services.lexmodelbuilding.model.GetBotsResult`"
  (^com.amazonaws.services.lexmodelbuilding.model.GetBotsResult [^AbstractAmazonLexModelBuilding this ^com.amazonaws.services.lexmodelbuilding.model.GetBotsRequest request]
    (-> this (.getBots request))))

(defn get-intent-versions
  "Description copied from interface: AmazonLexModelBuilding

  request - `com.amazonaws.services.lexmodelbuilding.model.GetIntentVersionsRequest`

  returns: Result of the GetIntentVersions operation returned by the service. - `com.amazonaws.services.lexmodelbuilding.model.GetIntentVersionsResult`"
  (^com.amazonaws.services.lexmodelbuilding.model.GetIntentVersionsResult [^AbstractAmazonLexModelBuilding this ^com.amazonaws.services.lexmodelbuilding.model.GetIntentVersionsRequest request]
    (-> this (.getIntentVersions request))))

(defn put-intent
  "Description copied from interface: AmazonLexModelBuilding

  request - `com.amazonaws.services.lexmodelbuilding.model.PutIntentRequest`

  returns: Result of the PutIntent operation returned by the service. - `com.amazonaws.services.lexmodelbuilding.model.PutIntentResult`"
  (^com.amazonaws.services.lexmodelbuilding.model.PutIntentResult [^AbstractAmazonLexModelBuilding this ^com.amazonaws.services.lexmodelbuilding.model.PutIntentRequest request]
    (-> this (.putIntent request))))

(defn delete-slot-type-version
  "Description copied from interface: AmazonLexModelBuilding

  request - `com.amazonaws.services.lexmodelbuilding.model.DeleteSlotTypeVersionRequest`

  returns: Result of the DeleteSlotTypeVersion operation returned by the service. - `com.amazonaws.services.lexmodelbuilding.model.DeleteSlotTypeVersionResult`"
  (^com.amazonaws.services.lexmodelbuilding.model.DeleteSlotTypeVersionResult [^AbstractAmazonLexModelBuilding this ^com.amazonaws.services.lexmodelbuilding.model.DeleteSlotTypeVersionRequest request]
    (-> this (.deleteSlotTypeVersion request))))

(defn delete-utterances
  "Description copied from interface: AmazonLexModelBuilding

  request - `com.amazonaws.services.lexmodelbuilding.model.DeleteUtterancesRequest`

  returns: Result of the DeleteUtterances operation returned by the service. - `com.amazonaws.services.lexmodelbuilding.model.DeleteUtterancesResult`"
  (^com.amazonaws.services.lexmodelbuilding.model.DeleteUtterancesResult [^AbstractAmazonLexModelBuilding this ^com.amazonaws.services.lexmodelbuilding.model.DeleteUtterancesRequest request]
    (-> this (.deleteUtterances request))))

(defn get-bot-channel-association
  "Description copied from interface: AmazonLexModelBuilding

  request - `com.amazonaws.services.lexmodelbuilding.model.GetBotChannelAssociationRequest`

  returns: Result of the GetBotChannelAssociation operation returned by the service. - `com.amazonaws.services.lexmodelbuilding.model.GetBotChannelAssociationResult`"
  (^com.amazonaws.services.lexmodelbuilding.model.GetBotChannelAssociationResult [^AbstractAmazonLexModelBuilding this ^com.amazonaws.services.lexmodelbuilding.model.GetBotChannelAssociationRequest request]
    (-> this (.getBotChannelAssociation request))))

(defn delete-bot
  "Description copied from interface: AmazonLexModelBuilding

  request - `com.amazonaws.services.lexmodelbuilding.model.DeleteBotRequest`

  returns: Result of the DeleteBot operation returned by the service. - `com.amazonaws.services.lexmodelbuilding.model.DeleteBotResult`"
  (^com.amazonaws.services.lexmodelbuilding.model.DeleteBotResult [^AbstractAmazonLexModelBuilding this ^com.amazonaws.services.lexmodelbuilding.model.DeleteBotRequest request]
    (-> this (.deleteBot request))))

(defn delete-bot-version
  "Description copied from interface: AmazonLexModelBuilding

  request - `com.amazonaws.services.lexmodelbuilding.model.DeleteBotVersionRequest`

  returns: Result of the DeleteBotVersion operation returned by the service. - `com.amazonaws.services.lexmodelbuilding.model.DeleteBotVersionResult`"
  (^com.amazonaws.services.lexmodelbuilding.model.DeleteBotVersionResult [^AbstractAmazonLexModelBuilding this ^com.amazonaws.services.lexmodelbuilding.model.DeleteBotVersionRequest request]
    (-> this (.deleteBotVersion request))))

(defn delete-intent
  "Description copied from interface: AmazonLexModelBuilding

  request - `com.amazonaws.services.lexmodelbuilding.model.DeleteIntentRequest`

  returns: Result of the DeleteIntent operation returned by the service. - `com.amazonaws.services.lexmodelbuilding.model.DeleteIntentResult`"
  (^com.amazonaws.services.lexmodelbuilding.model.DeleteIntentResult [^AbstractAmazonLexModelBuilding this ^com.amazonaws.services.lexmodelbuilding.model.DeleteIntentRequest request]
    (-> this (.deleteIntent request))))

(defn get-import
  "Description copied from interface: AmazonLexModelBuilding

  request - `com.amazonaws.services.lexmodelbuilding.model.GetImportRequest`

  returns: Result of the GetImport operation returned by the service. - `com.amazonaws.services.lexmodelbuilding.model.GetImportResult`"
  (^com.amazonaws.services.lexmodelbuilding.model.GetImportResult [^AbstractAmazonLexModelBuilding this ^com.amazonaws.services.lexmodelbuilding.model.GetImportRequest request]
    (-> this (.getImport request))))

(defn get-cached-response-metadata
  "Description copied from interface: AmazonLexModelBuilding

  request - The originally executed request. - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AbstractAmazonLexModelBuilding this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn get-builtin-intents
  "Description copied from interface: AmazonLexModelBuilding

  request - `com.amazonaws.services.lexmodelbuilding.model.GetBuiltinIntentsRequest`

  returns: Result of the GetBuiltinIntents operation returned by the service. - `com.amazonaws.services.lexmodelbuilding.model.GetBuiltinIntentsResult`"
  (^com.amazonaws.services.lexmodelbuilding.model.GetBuiltinIntentsResult [^AbstractAmazonLexModelBuilding this ^com.amazonaws.services.lexmodelbuilding.model.GetBuiltinIntentsRequest request]
    (-> this (.getBuiltinIntents request))))

(defn create-slot-type-version
  "Description copied from interface: AmazonLexModelBuilding

  request - `com.amazonaws.services.lexmodelbuilding.model.CreateSlotTypeVersionRequest`

  returns: Result of the CreateSlotTypeVersion operation returned by the service. - `com.amazonaws.services.lexmodelbuilding.model.CreateSlotTypeVersionResult`"
  (^com.amazonaws.services.lexmodelbuilding.model.CreateSlotTypeVersionResult [^AbstractAmazonLexModelBuilding this ^com.amazonaws.services.lexmodelbuilding.model.CreateSlotTypeVersionRequest request]
    (-> this (.createSlotTypeVersion request))))

(defn put-bot-alias
  "Description copied from interface: AmazonLexModelBuilding

  request - `com.amazonaws.services.lexmodelbuilding.model.PutBotAliasRequest`

  returns: Result of the PutBotAlias operation returned by the service. - `com.amazonaws.services.lexmodelbuilding.model.PutBotAliasResult`"
  (^com.amazonaws.services.lexmodelbuilding.model.PutBotAliasResult [^AbstractAmazonLexModelBuilding this ^com.amazonaws.services.lexmodelbuilding.model.PutBotAliasRequest request]
    (-> this (.putBotAlias request))))

(defn delete-bot-alias
  "Description copied from interface: AmazonLexModelBuilding

  request - `com.amazonaws.services.lexmodelbuilding.model.DeleteBotAliasRequest`

  returns: Result of the DeleteBotAlias operation returned by the service. - `com.amazonaws.services.lexmodelbuilding.model.DeleteBotAliasResult`"
  (^com.amazonaws.services.lexmodelbuilding.model.DeleteBotAliasResult [^AbstractAmazonLexModelBuilding this ^com.amazonaws.services.lexmodelbuilding.model.DeleteBotAliasRequest request]
    (-> this (.deleteBotAlias request))))

(defn get-slot-type-versions
  "Description copied from interface: AmazonLexModelBuilding

  request - `com.amazonaws.services.lexmodelbuilding.model.GetSlotTypeVersionsRequest`

  returns: Result of the GetSlotTypeVersions operation returned by the service. - `com.amazonaws.services.lexmodelbuilding.model.GetSlotTypeVersionsResult`"
  (^com.amazonaws.services.lexmodelbuilding.model.GetSlotTypeVersionsResult [^AbstractAmazonLexModelBuilding this ^com.amazonaws.services.lexmodelbuilding.model.GetSlotTypeVersionsRequest request]
    (-> this (.getSlotTypeVersions request))))

(defn delete-bot-channel-association
  "Description copied from interface: AmazonLexModelBuilding

  request - `com.amazonaws.services.lexmodelbuilding.model.DeleteBotChannelAssociationRequest`

  returns: Result of the DeleteBotChannelAssociation operation returned by the service. - `com.amazonaws.services.lexmodelbuilding.model.DeleteBotChannelAssociationResult`"
  (^com.amazonaws.services.lexmodelbuilding.model.DeleteBotChannelAssociationResult [^AbstractAmazonLexModelBuilding this ^com.amazonaws.services.lexmodelbuilding.model.DeleteBotChannelAssociationRequest request]
    (-> this (.deleteBotChannelAssociation request))))

