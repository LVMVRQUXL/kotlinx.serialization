package kotlinx.serialization.json

import kotlinx.serialization.*

/**
 * Configuration of the current [Json] instance available through [Json.configuration]
 * and configured with [JsonBuilder] constructor.
 *
 * Can be used for debug purposes and for custom Json-specific serializers
 * via [JsonEncoder] and [JsonDecoder].
 *
 * Standalone configuration object is meaningless and can nor be used outside the
 * [Json], neither new [Json] instance can be created from it.
 *
 * Detailed description of each property is available in [JsonBuilder] class.
 */
public class JsonConfiguration @OptIn(ExperimentalSerializationApi::class) internal constructor(
    public val encodeDefaults: Boolean = false,
    public val ignoreUnknownKeys: Boolean = false,
    public val isLenient: Boolean = false,
    public val allowStructuredMapKeys: Boolean = false,
    public val prettyPrint: Boolean = false,
    @ExperimentalSerializationApi
    public val explicitNulls: Boolean = true,
    @ExperimentalSerializationApi
    public val prettyPrintIndent: String = "    ",
    public val coerceInputValues: Boolean = false,
    public val useArrayPolymorphism: Boolean = false,
    public val classDiscriminator: String = "type",
    public val allowSpecialFloatingPointValues: Boolean = false,
    public val useAlternativeNames: Boolean = true,
    @ExperimentalSerializationApi
    public val namingStrategy: JsonNamingStrategy? = null,
    @ExperimentalSerializationApi
    public val decodeEnumsCaseInsensitive: Boolean = false,
    @ExperimentalSerializationApi
    public val allowTrailingComma: Boolean = false,
) {

    /** @suppress Dokka **/
    @OptIn(ExperimentalSerializationApi::class)
    override fun toString(): String {
        return "JsonConfiguration(encodeDefaults=$encodeDefaults, ignoreUnknownKeys=$ignoreUnknownKeys, isLenient=$isLenient, " +
                "allowStructuredMapKeys=$allowStructuredMapKeys, prettyPrint=$prettyPrint, explicitNulls=$explicitNulls, " +
                "prettyPrintIndent='$prettyPrintIndent', coerceInputValues=$coerceInputValues, useArrayPolymorphism=$useArrayPolymorphism, " +
                "classDiscriminator='$classDiscriminator', allowSpecialFloatingPointValues=$allowSpecialFloatingPointValues, useAlternativeNames=$useAlternativeNames, " +
                "namingStrategy=$namingStrategy, decodeEnumsCaseInsensitive=$decodeEnumsCaseInsensitive, allowTrailingComma=$allowTrailingComma)"
    }
}
